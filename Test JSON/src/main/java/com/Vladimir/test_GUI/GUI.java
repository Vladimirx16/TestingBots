package com.Vladimir.test_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Текущий IP");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        String IP = "";
        try {
            IP = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e){
            IP = "IP не найден";
        }
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Текущий IP адрес:"));
        panel.add(new JLabel("      " + IP + "      "));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
