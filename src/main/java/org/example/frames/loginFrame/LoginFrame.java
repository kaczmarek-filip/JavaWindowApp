package org.example.frames.loginFrame;

import org.example.frames.FrameConfig;
import org.example.frames.PassField;
import org.example.frames.TextField;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends FrameConfig {

    private TextField loginField = new TextField();
    private PassField passwordField = new PassField();
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

        add(new SignInSwitchButton(this, "Zarejestruj się"));
        add(new LoginButton(this, "Zaloguj"));

        pack();
    }
}
