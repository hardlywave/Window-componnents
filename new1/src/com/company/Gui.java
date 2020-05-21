package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
    boolean crlS = true;
    JFrame frame = new JFrame("Window");
    JPanel panel = new JPanel();
    private Combobox g1 = new Combobox();
    private Nameforbutton g2 = new Nameforbutton();
    private Radioandbutton g3 = new Radioandbutton();
    private Checkbox g4 = new Checkbox();
    private Tablewithbutton g5 = new Tablewithbutton();
    public Gui() throws InterruptedException {
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(g1.panel);
        panel.add(g2.panel);
        panel.add(g3.panel);
        panel.add(g4.panel);
        panel.add(g5.panel);
        frame.add(panel);
        frame.setVisible(true);
        panel.requestFocusInWindow();
    }
}
