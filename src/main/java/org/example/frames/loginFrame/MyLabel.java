package org.example.frames.loginFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @deprecated
 */
public class MyLabel {
    private String label;

    public MyLabel(String label){
        this.label = label;

        createLabel();
    }

    public JLabel createLabel(){
        JLabel jLabel = new JLabel(label);
        jLabel.setPreferredSize(new Dimension(50, 30));
        return jLabel;
    }
}
