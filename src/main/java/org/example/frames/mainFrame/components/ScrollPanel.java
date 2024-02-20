package org.example.frames.mainFrame.components;

import javax.swing.*;
import java.awt.*;

public class ScrollPanel extends JScrollPane {
    GridBagConstraints c = new GridBagConstraints();
    public ScrollPanel(Component view) {
        super(view);

//        setPreferredSize(new Dimension());

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = GridBagConstraints.REMAINDER;
        c.weightx = 0.3;
        c.weighty = 1;
//        c.gridheight = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.NORTH;
//        c.anchor = GridBagConstraints.NORTH;

    }
    public GridBagConstraints getConstraints(){
        return c;
    }
}
