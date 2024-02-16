package org.example;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private String id;
    private String login;
    private String password;


    public User(String id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
}
