package org.example.frames.loginFrame;

import org.example.frames.signInFrame.SignInFrame;

import javax.swing.*;

public class SignInSwitchButton extends LoginFrameButton {

    public SignInSwitchButton(JFrame frameToClose, String text) {
        super(frameToClose, text);
    }

    @Override
    public void openMainFrame() {
        //TODO: Otwiera okienko rejestracji
        new SignInFrame();
    }

    @Override
    public void databaseListener(String login, String password) {

    }
}
