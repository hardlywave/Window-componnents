package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Radioandbutton extends JFrame {
    boolean controlS;
    JPanel panel = new JPanel();
    JTextField text_field = new JTextField("", 5);
    JButton button = new JButton("Press for choose button");
    JRadioButton radio_button1 = new JRadioButton("Text 1");
    JRadioButton radio_button2 = new JRadioButton("Text 2");
    JRadioButton radio_button3 = new JRadioButton("Text 3");

    public Radioandbutton() {
        super("Simple Example");
        controlS = false;

        panel.setLayout(new BorderLayout());

        panel.add(text_field, BorderLayout.NORTH);
        panel.add(radio_button1, BorderLayout.WEST);
        panel.add(radio_button2, BorderLayout.CENTER);
        panel.add(radio_button3, BorderLayout.EAST);
        panel.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ButtonEventListener());

        panel.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            radio_button1.setSelected(false);
            radio_button2.setSelected(false);
            radio_button3.setSelected(false);
            String message = "There is no RadioButton with this name";

            String text = text_field.getText();
            String text_radio_button_1 = radio_button1.getText();
            String text_radio_button_2 = radio_button2.getText();
            String text_radio_button_3 = radio_button3.getText();
            if (text.equals(text_radio_button_1)) radio_button1.setSelected(true);
            else if (text.equals(text_radio_button_2)) radio_button2.setSelected(true);
            else if (text.equals(text_radio_button_3)) radio_button3.setSelected(true);
            else JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
