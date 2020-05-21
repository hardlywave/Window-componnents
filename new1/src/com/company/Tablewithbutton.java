package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tablewithbutton extends JFrame {
    boolean controlS = false;
    JPanel panel = new JPanel();
    JTable table = new JTable(1,2);
    JTextField text_field = new JTextField("", 5);

    JButton button1 = new JButton("Add");
    JButton button2 = new JButton("Put in 2nd");
    JButton button3 = new JButton("Swap");

    public Tablewithbutton() {
        super("Simple Example");
        controlS = false;

        panel.setLayout(new BorderLayout());

        panel.add(text_field, BorderLayout.NORTH);
        panel.add(button1, BorderLayout.WEST);
        panel.add(button2, BorderLayout.CENTER);
        panel.add(button3, BorderLayout.EAST);
        panel.add(table, BorderLayout.SOUTH);
        button1.addActionListener(new ButtonEventListener(1));
        button2.addActionListener(new ButtonEventListener(2));
        button3.addActionListener(new ButtonEventListener(3));

        panel.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        int buttonNumber;
        public ButtonEventListener(int n){
            buttonNumber = n;
        }
        public void actionPerformed(ActionEvent e) {
            switch (buttonNumber) {
                case 1:
                    table.setValueAt(text_field.getText(), 0, 0);
                    table.setValueAt("", 0, 1);
                    break;
                case 2:
                    if (!table.getValueAt(0,0).equals("")) {
                        table.setValueAt(table.getValueAt(0,0), 0, 1);
                        table.setValueAt("", 0, 0);
                    }
                    break;
                case 3:
                    if (!table.getValueAt(0,1).equals("")) {
                        table.setValueAt(table.getValueAt(0, 1), 0, 0);
                        table.setValueAt("", 0, 1);
                    }
                    break;
            }
        }
    }
}