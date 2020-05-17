package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Nameforbutton extends JFrame{
    boolean controlS;
    JPanel panel = new JPanel();
    JTextField text_field = new JTextField("",5);
    JButton button1 = new JButton("Named");
    JButton button2 = new JButton("Swap");

    public Nameforbutton(){
        super("Simple Example");

        controlS = false;

        panel.setLayout(new BorderLayout());

        panel.add(button1, BorderLayout.NORTH);
        panel.add(text_field, BorderLayout.CENTER);
        panel.add(button2, BorderLayout.SOUTH);
        button1.addActionListener(new Button1EventListener());
        button2.addActionListener(new Button2EventListener());

        panel.setVisible(true);

    }

    class Button1EventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String text = text_field.getText();
            button2.setText(text);

        }
    }

    class Button2EventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String text_button1 = button1.getText();
            String text_button2 = button2.getText();
            button1.setText(text_button2);
            button2.setText(text_button1);
        }
    }
}