package org.example.frames.loginFrame;

import org.example.frames.FrameButton;
import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;

public class LoginButton extends FrameButton {


    public LoginButton(JFrame frameToClose, String text) {
        super(frameToClose, text);
    }

    @Override
    public void openFrame() {
        new MainFrame();
    }

    @Override
    public void databaseListener(String login, String password) {

    }
}
