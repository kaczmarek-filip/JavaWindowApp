package org.example.frames.mainFrame.components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LeftPanel extends PanelConfig{
    public LeftPanel() {
        super();
//        setBorder(BorderFactory.createCompoundBorder(
//                new EmptyBorder(0, 0, 0, 0),
//                BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY)
//        ));
//        setLayout(new GridLayout());
//        setLayout(new ScrollPaneLayout.UIResource());
//        c.gridx = 0;
//        setMinimumSize(new Dimension(Panel.WIDTH, 600));
//        c.gridy = 0;
//        c.gridwidth = 1;
//        c.gridheight = GridBagConstraints.RELATIVE;
        c.weightx = 0.3;
//        c.weighty = 1;
//        c.gridheight = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH; // BOTH
        c.anchor = GridBagConstraints.NORTH;
        c.weighty = 1;
//        c.weighty = GridBagConstraints.REMAINDER;
//        c.anchor = GridBagConstraints.NORTH;
    }
}
