package org.example.database;

import org.example.User;

import java.sql.*;

public class DatabaseConnection {
    private final static String DbUrl = "jdbc:mysql://localhost/java";
    private final static String DbUser = "root";
    private final static String DbPassword = "";
    private final static String DbDriver = "com.mysql.cj.jdbc.Driver";

    private Connection connection;
    private Statement statement;
    private String query;
    private SqlUserParser sqlUserParser;

    public DatabaseConnection() {
        sqlUserParser = new SqlUserParser();
    }

    public void save(User user){
        query = sqlUserParser.createUser(user);

        try {
            Class.forName(DbDriver);
            connection = DriverManager.getConnection(DbUrl, DbUser, DbPassword);
            statement = connection.createStatement();
            statement.execute(query);

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isLoginExists(String login){
        query = sqlUserParser.checkLogin(login);

        try {
            Class.forName(DbDriver);
            connection = DriverManager.getConnection(DbUrl, DbUser, DbPassword);
            statement = connection.createStatement();

            try (ResultSet resultSet = statement.executeQuery(query)) {

                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    if (count != 0){
                        return true;
                    }
                }
            }

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public User authentication(String login, String password){
        query = sqlUserParser.authentication(login, password);

        try {
            Class.forName(DbDriver);
            connection = DriverManager.getConnection(DbUrl, DbUser, DbPassword);
            statement = connection.createStatement();

            try (ResultSet resultSet = statement.executeQuery(query)) {

//                if (resultSet.next()) {
//                    int count = resultSet.getInt(1);
//                    if (count == 1){
////                        return true; // TODO: Jeżeli prawidłowo, to pobierz login, hasło i ID użytkownika
//                        String userLogin = resultSet.getString("login");
//                        String userPassword = resultSet.getString("password");
//                        String userId = resultSet.getString("ID");
//                        return new User(userId, userLogin, userPassword);
//                    }
//                }
                if (resultSet.next()) {
                    String userLogin = resultSet.getString("login");
                    String userPassword = resultSet.getString("password");
                    String userId = resultSet.getString("ID");

                    if (login.equals(userLogin) && password.equals(userPassword)) {
                        return new User(userId, userLogin, userPassword);
                    }
                }
            }

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
