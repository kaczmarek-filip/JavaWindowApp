package org.example.frames.mainFrame.components;

import javax.swing.*;
import java.awt.*;

public class Conversation extends PanelConfig{
    public Conversation() {
        super();

        setBackground(Color.BLUE);


        c.gridx = 0;
        c.gridy = 0;
//        c.gridwidth = 3;
        c.weightx = 1;
        c.weighty = 0.9;
        c.fill = GridBagConstraints.BOTH;
    }
}
