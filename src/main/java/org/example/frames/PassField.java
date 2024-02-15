package org.example.frames;

import javax.swing.*;
import java.awt.*;


public class PassField extends JPasswordField {
    public PassField() {
        setPreferredSize(new Dimension(200, 30));
        setFont(new Font("Arial", Font.BOLD, 14));
    }
}
