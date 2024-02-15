package org.example.database;

import org.example.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            e.printStackTrace();
        }
    }
}
