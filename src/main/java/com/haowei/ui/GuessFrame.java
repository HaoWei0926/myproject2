package com.haowei.ui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("Zzzzz...");
    JTextField number = new JTextField(5);
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    public GuessFrame(){
        super();
        setSize(500,400);
        setLocation(150,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.print(num);
                System.out.println(" "+secret);
                for (int i = 0; i < 5; i++) {
                    if (num > secret){
                        label.setText("Smaller");
                    } else if (num < secret) {
                        label.setText("Bigger");
                    } else {
                        label.setText("You win!");
                        break;
                    }
                }
                //System.out.println("Hello");
                //label.setText("Hola");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    public static void main(String[] args) {
        GuessFrame guessFrame =  new GuessFrame();
    }
}
