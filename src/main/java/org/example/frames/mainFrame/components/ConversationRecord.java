package org.example.frames.mainFrame.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ConversationRecord extends PanelConfig {
    private static int numberOfObjects;
    private String textLabel;
    public ConversationRecord(String textLabel) {
        super();
        numberOfObjects++;
        this.textLabel = textLabel;

        JLabel jLabel = new JLabel(textLabel);
        setBorder(BorderFactory.createCompoundBorder(
                new EmptyBorder(0, 0, 10, 0),
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY)
        ));



        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 0;
        c.gridy = 0 + numberOfObjects; // ++
//        c.gridx = 2;
        c.weightx = 1;
        c.weighty = 0; // ++ // 1
//        c.ipadx = 20;
        c.ipady = 20;
//        c.insets = new Insets(5, 5, 5, 5);

        add(jLabel);
    }
}
