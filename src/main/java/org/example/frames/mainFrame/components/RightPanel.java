package org.example.frames.mainFrame.components;

import java.awt.*;

public class RightPanel extends PanelConfig{
    Conversation conversation = new Conversation();
    MessageField messageField = new MessageField();
    public RightPanel() {
        super();


        c.gridx = 1; // 1
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 0.7;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        add(conversation, conversation.getConstraints());
        add(messageField, messageField.getConstraints());
    }
}
