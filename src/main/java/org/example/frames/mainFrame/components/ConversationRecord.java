package org.example.frames.mainFrame.components;

import org.example.frames.MessageFrame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConversationRecord extends PanelConfig {
//    private static int numberOfObjects;
    private String textLabel;
    public ConversationRecord(String textLabel) {
        super();
//        numberOfObjects++;
        this.textLabel = textLabel;

        JLabel jLabel = new JLabel(textLabel);
        setBorder(BorderFactory.createCompoundBorder(
                new EmptyBorder(0, 0, 0, 0),
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)
        ));
//        setBackground(Color.BLUE);

//        setPreferredSize(new Dimension(150, 20));

        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.NORTH;
//        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 0;
//        c.gridheight = 0;
////        c.gridy = 0 + numberOfObjects; // ++
//        c.gridy = GridBagConstraints.RELATIVE;
        c.weightx = 1;
//        c.weighty = 1;
////        c.weighty = 1; // ++ // 1 // GridBagConstraints.RELATIVE
////        c.weighty = 0;
//        c.weighty = GridBagConstraints.RELATIVE;
//        c.gridwidth = 1;
        c.ipady = 20;

        add(jLabel);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                new MessageFrame("Otwarto");
                setBackground(Color.RED);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
