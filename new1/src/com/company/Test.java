package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Test extends JFrame implements KeyListener  {
    boolean crlS = false;
/*    static int g = 0, j = 0;
    List<Component> list = new ArrayList<>();
*/
    JTextField input = new JTextField("", 5);
    JLabel label = new JLabel("Input:");
    JRadioButton radio1 = new JRadioButton("Select 1");
    JRadioButton radio2 = new JRadioButton("Select 2");
    JCheckBox check = new JCheckBox("Check", false);
    Container container = getContentPane();

    public Test() throws InterruptedException {
        super("Simple Example");
        int i = 0;
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(label).setFocusable(false);
        container.add(input).setFocusable(false);
        container.add(radio1).setFocusable(false);
        container.add(radio2).setFocusable(false);
        container.add(check).setFocusable(false);

        while(true) {
            System.out.println(i);
            while (crlS) {
                if (i == 0) {
                    container.add(label).setVisible(true);
                    container.add(input).setVisible(true);
                    container.add(radio1).setVisible(true);
                    container.add(radio2).setVisible(true);
                    container.add(check).setVisible(true);
                }
                //System.out.println(i + 1);
                showGroup(i);
                Thread.sleep(1000);
                i++;
                if (i > 5) i = 1;
                System.out.println(i);
            }
        }
    }
/*
        list.add(label);
        list.add(input);
        list.add(radio1);
        list.add(button);
        list.add(check);

       while(true) {
            System.out.println(i);
            while (crlS) {

               System.out.println(i);
               showGroup(i);

               i++;
               if (i > 5) i = 1;
            }
        while (true) {
            System.out.println(i);
            if (i == 0) {
                for (Component component : list) mainPanel.add(component);
            }
            Thread.sleep(1000);
            while (crlS) {
                for (g = 0; g < this.list.size()-1; g++) {
                    // Component a = mainPanel.getComponent(g);
                    Component a = list.get(g);
                    for (j = 0; j < list.size()-1; j++) {
                        //Component b = mainPanel.getComponent(j);
                        Component b = list.get(j);
                        list.set(j,a);
                        list.set(g,b);
                        break;
                    }
                }
               for (Component component : list) mainPanel.getComponents();
                for (Component component : list) mainPanel.add(component);
                Thread.sleep(1000);
            }
            for (Component cmp: list){
                mainPanel.getCo
            }
        }
    }
*/

    public void showGroup(int i){
        boolean b;
        switch (i){
            case 1:
               b = false;
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                b = true;
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                break;
            case 2:
                b = false;
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                b = true;
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                break;
            case 3:
                b = false;
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                b = true;
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                break;
            case 4:
                b = false;
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                b = true;
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                container.add(input).setVisible(b);
                break;
            case 5:
                b = false;
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                b = true;
                container.add(input).setVisible(b);
                container.add(radio1).setVisible(b);
                container.add(radio2).setVisible(b);
                container.add(check).setVisible(b);
                container.add(label).setVisible(b);
                break;
        }
    }

    public void keyTyped (KeyEvent e){}

    public void keyPressed (KeyEvent e){
        if (e.getKeyCode() == 83 & e.isControlDown()) crlS = true;
        if (e.getKeyCode() == 82 & e.isControlDown()) crlS = false;
    }

    public void keyReleased(KeyEvent e){}
}
