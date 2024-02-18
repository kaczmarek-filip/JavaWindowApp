package org.example.frames.mainFrame;

import org.example.User;
import org.example.frames.mainFrame.components.*;

import javax.swing.*;
import java.awt.*;
//TODO: Szyfrowanie haseł
public class MainFrame extends JFrame {

    private LeftPanel leftPanel = new LeftPanel();
    private RightPanel rightPanel = new RightPanel();
//    private ConversationRecord conversationRecord = new ConversationRecord("Filip Kaczmarek");
//    private ConversationRecord2 conversationRecord2 = new ConversationRecord2();
    public MainFrame(User user){
        super("Aplikacja " + user.getLogin());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,600));
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setVisible(true);


//        JScrollPane jScrollPane = new JScrollPane();
//        jScrollPane.add(leftPanel, leftPanel.getConstraints());

        add(leftPanel, leftPanel.getConstraints());
        add(rightPanel, rightPanel.getConstraints());
//        leftPanel.add(conversationRecord, conversationRecord.getConstraints());
//        leftPanel.add(conversationRecord2, conversationRecord2.getConstraints());
        for(int i = 0; i < 3; i++){
            ConversationRecord conversationRecord = new ConversationRecord("Fifi");
            leftPanel.add(conversationRecord, conversationRecord.getConstraints());
        }





        pack();
    }
}
