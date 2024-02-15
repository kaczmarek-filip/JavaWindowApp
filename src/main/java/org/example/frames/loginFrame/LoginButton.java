package org.example.frames.loginFrame;

import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;

public class LoginButton extends LoginFrameButton {


    public LoginButton(JFrame frameToClose, String text) {
        super(frameToClose, text);
    }

    @Override
    public void openMainFrame() {
        new MainFrame();
    }

    @Override
    public void databaseListener(String login, String password) {

    }
}
