package org.example.frames.mainFrame.components;

import javax.swing.*;
import java.awt.*;

public abstract class PanelConfig extends JPanel {
    GridBagConstraints c = new GridBagConstraints();
    public PanelConfig() {
        super(new GridBagLayout());
    }


    public GridBagConstraints getConstraints(){
        return c;
    }
}

