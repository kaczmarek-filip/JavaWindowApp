package org.example.frames.mainFrame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        super("Aplikacja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,200));
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        setVisible(true);
    }
}
