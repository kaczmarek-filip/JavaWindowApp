package org.example.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageFrame extends FrameConfig {
    private JLabel errorLabel = new JLabel();
    private JButton okButton = new JButton();
    private String errorMessage;
    public MessageFrame(String errorMessage) {
        super("Błąd",
                400,
                150,
                new FlowLayout(FlowLayout.CENTER, 0, 20)
        );
        this.errorMessage = errorMessage;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        label();
        button();

        add(errorLabel);
        add(new JPanel());
        add(okButton);

        listener();

    }
    private void label(){
        errorLabel.setText(errorMessage);
        errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        errorLabel.setPreferredSize(new Dimension(300, 30));
    }
    private void button(){
        okButton.setPreferredSize(new Dimension(100, 30));
        okButton.setText("OK");
        okButton.setHorizontalAlignment(SwingConstants.CENTER);
    }
    private void listener(){
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MessageFrame.super.dispose();
            }
        });
    }
}
