package org.example.frames.signInFrame;

import org.example.frames.FrameConfig;
import org.example.frames.PassField;
import org.example.frames.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInFrame extends FrameConfig {

    private TextField loginField = new TextField();
    private PassField passwordField = new PassField();
    private PassField repeatPasswordField = new PassField();
    private SignInButton signInButton;

    private String login;
    private String password;
    private String repeatPassword;
    public SignInFrame(){
        super("Rejestracja",
                400,
                250,
                new FlowLayout(FlowLayout.RIGHT, 40, 20)
        );

        signInButton = new SignInButton(this, "Zarejestruj się");


        add(new JLabel("Login:"));
        add(loginField);

        add(new JLabel("Hasło:"));
        add(passwordField);

        add(new JLabel("Powtórz hasło:"));
        add(repeatPasswordField);


        add(signInButton);

        listener();
    }


    private void listener(){
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login = loginField.getText();
                password = passwordField.getText();
                repeatPassword = repeatPasswordField.getText();

                RegisterChecker passwordChecker = new RegisterChecker(login, password, repeatPassword);


                if(passwordChecker.isCorrect() == null){
                    signInButton.databaseListener(login, password);
                    signInButton.closeFrame();
                    signInButton.openFrame();
                } else {
                    signInButton.error(passwordChecker);
                }

            }
        });
    }

}
