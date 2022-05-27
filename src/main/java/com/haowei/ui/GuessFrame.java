package com.haowei.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    JButton button = new JButton("Ok");
    JLabel label = new JLabel("Hola");
    public GuessFrame(){
        super();
        setSize(500,400);
        setLocation(150,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello");
                label.setText("Hello");
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);
    }
    public static void main(String[] args) {
        GuessFrame guessFrame =  new GuessFrame();
    }
}
