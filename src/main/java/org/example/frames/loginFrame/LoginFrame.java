package org.example.frames.loginFrame;

import org.example.frames.FrameConfig;
import org.example.frames.MessageFrame;
import org.example.frames.PassField;
import org.example.frames.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends FrameConfig {

    private TextField loginField = new TextField();
    private PassField passwordField = new PassField();
    private SignInSwitchButton signInSwitchButton = new SignInSwitchButton(this, "Zarejestruj się");
    private LoginButton loginButton = new LoginButton(this, "Zaloguj");

    private String login;
    private String password;
    public LoginFrame(){
        super("Logowanie",
                400,
                200,
                new FlowLayout(FlowLayout.CENTER, 50, 20)
        );

        add(new JLabel("Login: "));
        add(loginField);
        add(new JLabel("Hasło:"));
        add(passwordField);

        add(signInSwitchButton);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login = loginField.getText();
                password = passwordField.getText();

                if(loginButton.databaseListener(login, password)){
                    loginButton.closeFrame();
                    loginButton.openFrame();
                } else {
                    new MessageFrame("Błędne dane logowania");
                }
            }
        });

        pack();
    }
}
