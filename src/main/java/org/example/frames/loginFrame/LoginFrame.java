package org.example.frames.loginFrame;

import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import com.mysql.cj.jdbc.exceptions.SQLError;
import org.example.User;
import org.example.frames.FrameConfig;
import org.example.frames.MessageFrame;
import org.example.frames.PassField;
import org.example.frames.TextField;
import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.SQLException;

public class LoginFrame extends FrameConfig{

    private TextField loginField = new TextField();
    private PassField passwordField = new PassField();
    private SignInSwitchButton signInSwitchButton = new SignInSwitchButton(this, "Zarejestruj się");
    private LoginButton loginButton = new LoginButton(this, "Zaloguj");

    private String login;
    private String password;
    private User user;
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

                try {
                    user = loginButton.databaseListener(login, password);
                    if(user != null){
                        loginButton.closeFrame();
                        new MainFrame(user);
                    } else {
                        new MessageFrame("Błędne dane logowania");
                    }
                } catch (RuntimeException exception) {
                    new MessageFrame("Błąd połączenia z bazą danych");
                }


            }
        });

        pack();
    }
}
