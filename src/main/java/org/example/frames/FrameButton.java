package org.example.frames;

import org.example.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class FrameButton extends JButton{
    public JFrame frameToClose;

    public FrameButton(JFrame frameToClose, String text) {
        super(text);
        this.frameToClose = frameToClose;

        create();
    }

    public JButton create(){
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeFrame();
                openFrame();
            }
        });

        return this;
    }
    public abstract void openFrame();
    public abstract User databaseListener(String login, String password);
    public void closeFrame(){
        frameToClose.dispose();
    }
}
