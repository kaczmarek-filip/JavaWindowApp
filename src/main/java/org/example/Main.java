package org.example;


import org.example.frames.MessageFrame;
import org.example.frames.loginFrame.LoginFrame;
import org.example.frames.mainFrame.MainFrame;

public class Main {
    public static void main(String[] args) {
//            new LoginFrame();
            new MainFrame(new User("0", "test", "test"));
        }
    }