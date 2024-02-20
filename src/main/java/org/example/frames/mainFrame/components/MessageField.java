package org.example.frames.mainFrame.components;

import java.awt.*;

public class MessageField extends PanelConfig{
    public MessageField() {
        super();

        setBackground(Color.RED);
        c.gridx = 0;
        c.gridy = 1;
//        c.gridwidth = 3;
        c.weightx = 1;
        c.weighty = 0.1;
        c.fill = GridBagConstraints.BOTH;
    }
}
