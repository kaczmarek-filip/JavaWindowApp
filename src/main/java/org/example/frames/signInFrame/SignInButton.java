package org.example.frames.signInFrame;

import org.example.User;
import org.example.database.DatabaseConnection;
import org.example.frames.loginFrame.LoginFrameButton;
import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;

public class SignInButton extends LoginFrameButton {
    public SignInButton(JFrame frameToClose, String text) {
        super(frameToClose, text);
    }

    @Override
    public void openMainFrame() {
        new MainFrame();
    }

    @Override
    public void databaseListener(String login, String password) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        User user = new User(login, password);
        databaseConnection.save(user);
    }
}
