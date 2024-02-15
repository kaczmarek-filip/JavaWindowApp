package org.example.frames;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class TextField extends JTextField{
    public TextField() {
        setPreferredSize(new Dimension(200, 30));
        setFont(new Font("Arial", Font.BOLD, 14));
    }
}
