package org.example.database;

import org.example.User;

public class SqlUserParser {
    private String query;
    public String createUser(User user){
        query = "INSERT INTO `users`(`login`, `password`) VALUES ('" + user.getLogin() + "','" + user.getPassword() + "')";

        return query;
    }
    public String checkLogin(String login){
        query = "SELECT COUNT(*) FROM users WHERE login = '" + login + "';";

        return query;
    }
}
