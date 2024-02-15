package org.example.frames.loginFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class LoginFrameButton extends JButton{
    private JFrame frameToClose;

    public LoginFrameButton(JFrame frameToClose, String text) {
        super(text);
        this.frameToClose = frameToClose;

        create();
    }

    private JButton create(){
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeLoginFrame();
                openMainFrame();
            }
        });

        return this;
    }
    public abstract void openMainFrame();
    public abstract void databaseListener(String login, String password);
    private void closeLoginFrame(){
        frameToClose.dispose();
    }
}
