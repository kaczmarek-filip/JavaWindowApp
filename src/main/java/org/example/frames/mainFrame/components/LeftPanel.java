package org.example.frames.mainFrame.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LeftPanel extends PanelConfig{
    public LeftPanel() {
        super();

        setBorder(BorderFactory.createCompoundBorder(
                new EmptyBorder(10, 0, 10, 10),
                BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY)
        ));

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.weightx = 0.3;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.NORTH;
    }
}
