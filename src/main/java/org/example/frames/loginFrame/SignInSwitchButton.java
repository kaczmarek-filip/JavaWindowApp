package org.example.frames.loginFrame;

import org.example.frames.FrameButton;
import org.example.frames.signInFrame.SignInFrame;

import javax.swing.*;

public class SignInSwitchButton extends FrameButton {

    public SignInSwitchButton(JFrame frameToClose, String text) {
        super(frameToClose, text);
    }

    @Override
    public void openFrame() {
        //TODO: Otwiera okienko rejestracji
        new SignInFrame();
    }

    @Override
    public void databaseListener(String login, String password) {

    }
}
