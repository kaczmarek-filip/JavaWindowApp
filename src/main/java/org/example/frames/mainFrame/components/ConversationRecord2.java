package org.example.frames.mainFrame.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ConversationRecord2 extends PanelConfig {
    public ConversationRecord2() {
        super();

        JLabel jLabel = new JLabel("Jan Kowalski");
        setBorder(BorderFactory.createCompoundBorder(
                new EmptyBorder(0, 0, 10, 0),
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY)
        ));


        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady = 40;

        add(jLabel);
    }
}
