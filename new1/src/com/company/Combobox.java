package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combobox extends JFrame{
    JPanel panel = new JPanel();
    private JComboBox<String> combo = new JComboBox<>();
    private JButton button = new JButton("Add");
    private JTextField input = new JTextField("", 5);

    public Combobox(){
        super("First example");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());

        panel.add(button, BorderLayout.NORTH);
        panel.add(input, BorderLayout.CENTER);
        panel.add(combo, BorderLayout.SOUTH);
        button.addActionListener(new ButtonEventListener());
    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "This item is already in comboBox";
            String text_to_add = "";
            text_to_add = input.getText();
            int combo_item_amount = combo.getItemCount();
            boolean f = true;
            for (int i = 0; i < combo_item_amount; i++){
                if (text_to_add.equals(combo.getItemAt(i))) {
                    f = false;
                    break;
                }
            }
            if (f) {
                combo.addItem(text_to_add);
            }
            else {
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

}
