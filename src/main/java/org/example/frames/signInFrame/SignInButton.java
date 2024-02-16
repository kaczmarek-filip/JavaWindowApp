package org.example.frames.signInFrame;

import org.example.User;
import org.example.database.DatabaseConnection;
import org.example.frames.MessageFrame;
import org.example.frames.FrameButton;
import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;

public class SignInButton extends FrameButton {
    public SignInButton(JFrame frameToClose, String text) {
        super(frameToClose, text);

    }

    @Override
    public void openFrame() {
        new MainFrame();
    }

    @Override
    public JButton create() {
        return this;
    }

    @Override
    public boolean databaseListener(String login, String password) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        User user = new User(login, password);
        databaseConnection.save(user);
        return true;
    }

    public void error(RegisterChecker passwordChecker) {
        String errorMessage = passwordChecker.isCorrect();
        new MessageFrame(errorMessage);
    }

    @Override
    public void closeFrame() {
        frameToClose.dispose();
    }
}
