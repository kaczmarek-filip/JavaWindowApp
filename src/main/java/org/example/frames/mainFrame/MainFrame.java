package org.example.frames.mainFrame;

import org.example.User;
import org.example.frames.MessageFrame;
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
        super("Komunikator:  " + user.getLogin());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,600));
        setResizable(true);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setVisible(true);

//        GridBagConstraints gridBagConstraints = new GridBagConstraints();
//        gridBagConstraints.gridheight = GridBagConstraints.REMAINDER;



        JScrollPane jScrollPane = new JScrollPane(leftPanel);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        jScrollPane.setLayout(new GridBagLayout());
//        jScrollPane.setAlignmentY(JScrollPane.TOP_ALIGNMENT);
        add(jScrollPane, leftPanel.getConstraints());
        add(rightPanel, rightPanel.getConstraints());

        for(int i = 0; i < 16; i++){
            ConversationRecord conversationRecord = new ConversationRecord("Filip Kaczmarek");
            leftPanel.add(conversationRecord, conversationRecord.getConstraints());

//            if(i > 16){
//                leftPanel.check();
//            }
        }





        pack();
    }
}
