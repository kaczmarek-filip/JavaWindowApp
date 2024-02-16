package org.example.frames.loginFrame;

import org.example.database.DatabaseConnection;
import org.example.frames.mainFrame.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @deprecated
 */

public class MyButton{
    private String buttonLabel;
    private JButton jButton;
    private JFrame frameToClose;

    private boolean openMainFrame;

    public MyButton(String buttonLabel) {
        this.buttonLabel = buttonLabel;
        jButton = new JButton(buttonLabel);
    }
    public MyButton(String buttonLabel, JFrame frameToClose){
        this.buttonLabel = buttonLabel;
        this.frameToClose = frameToClose;

        jButton = new JButton(buttonLabel);

        closeFrame();
    }
    public MyButton(String buttonLabel, JFrame frameToClose, boolean openMainFrame){
        this.buttonLabel = buttonLabel;
        this.frameToClose = frameToClose;
        this.openMainFrame = openMainFrame;

        jButton = new JButton(buttonLabel);

        openFrame();
        closeFrame();

    }

    public JButton createButton(){
        return jButton;
    }

    public void closeFrame(){
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameToClose.dispose();
            }
        });
    }
    public void openFrame(){
        if(openMainFrame){
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    new MainFrame();

                    DatabaseConnection databaseConnection = new DatabaseConnection();
//                    databaseConnection.save(new User("test", "testPass"));
                }
            });
        } else {
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //TODO: newSignInFrame
                }
            });
        }
    }
}
