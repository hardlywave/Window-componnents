package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class Checkbox extends JFrame {
    boolean controlS;
    JPanel panel = new JPanel();
    JTextField text_field = new JTextField("", 5);
    JButton button = new JButton("Press");
    JCheckBox check_box_1 = new JCheckBox("Text 1");
    JCheckBox check_box_2 = new JCheckBox("Text 2");
    JCheckBox check_box_3 = new JCheckBox("Text 3");

    public Checkbox() {
        super("Simple Example");
        controlS = false;

        panel.setLayout(new BorderLayout());

        panel.add(text_field, BorderLayout.NORTH);
        panel.add(check_box_2, BorderLayout.CENTER);
        panel.add(check_box_1, BorderLayout.WEST);
        panel.add(check_box_3, BorderLayout.EAST);
        panel.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ButtonEventListener());

        panel.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "There is no RadioButton with this name";
            String text = text_field.getText();

            if(!(toogle(check_box_1,text) || toogle(check_box_2,text) || toogle(check_box_3,text)))
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
        private boolean toogle(JCheckBox checkBox, String text){
            if(text.equals(checkBox.getText())) {
                checkBox.setSelected(!checkBox.isSelected());
                return true;
            }
            else return false;
        }
    }
}