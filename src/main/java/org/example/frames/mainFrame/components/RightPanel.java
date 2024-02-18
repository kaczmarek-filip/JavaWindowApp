package org.example.frames.mainFrame.components;

import java.awt.*;

public class RightPanel extends PanelConfig{
    public RightPanel() {
        super();
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 3;
        c.weightx = 0.7;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
    }
}
