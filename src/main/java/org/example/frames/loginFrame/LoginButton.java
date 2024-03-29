package org.example.frames.loginFrame;

import org.example.User;
import org.example.database.DatabaseConnection;
import org.example.frames.FrameButton;
import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;
import java.net.URISyntaxException;

public class LoginButton extends FrameButton {


    public LoginButton(JFrame frameToClose, String text) {
        super(frameToClose, text);
    }

    @Override
    public JButton create() {
//        return super.create();
        return this;
    }

    @Override
    public void openFrame() {
//        new MainFrame();
    }

    @Override
    public User databaseListener(String login, String password) {
        DatabaseConnection databaseConnection = new DatabaseConnection();

        return databaseConnection.authentication(login, password);
    }

    @Override
    public void closeFrame() {
        super.closeFrame();
    }
}
