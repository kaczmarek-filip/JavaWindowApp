package org.example.frames;

import lombok.RequiredArgsConstructor;

import javax.swing.*;
import java.awt.*;

public abstract class FrameConfig extends JFrame {
    private int width;
    private int height;


    public FrameConfig(String title, int width, int height, LayoutManager layout){
        super(title);
        this.width = width;
        this.height = height;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(this.width, this.height));
        setSize(300, 300);
        setLayout(layout);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        pack();
    }

}
