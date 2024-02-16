package org.example.frames.mainFrame;

import org.example.User;

import javax.swing.*;
import java.awt.*;
//TODO: Szyfrowanie haseł
public class MainFrame extends JFrame {
    public MainFrame(User user){
        super("Aplikacja " + user.getId() + ":" + user.getLogin());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,200));
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        setVisible(true);
    }
}
