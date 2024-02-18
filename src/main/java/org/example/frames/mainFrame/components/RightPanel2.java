package org.example.frames.mainFrame.components;

import javax.swing.*;
import java.awt.*;

/**
 * @deprecated
 */
public class RightPanel2 extends JPanel {
    RightPanelConstraints constraints = new RightPanelConstraints();
    public RightPanel2() {
        super(new GridBagLayout());

    }

    public RightPanelConstraints getConstraints() {
        return constraints;
    }
}

/**
 * @deprecated
 */
class RightPanelConstraints extends GridBagConstraints {
    public RightPanelConstraints() {
        gridx = 2;
        gridy = 0;
        gridwidth = 3;
        weightx = 0.7;
        weighty = 1;
        fill = GridBagConstraints.BOTH;
    }
}
