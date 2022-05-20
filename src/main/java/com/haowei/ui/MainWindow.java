package com.haowei.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interface(GUI)
        //swing, JaveFX
        //eXtension
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello World!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        System.out.println();
    }
}