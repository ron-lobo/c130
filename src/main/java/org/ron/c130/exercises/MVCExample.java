package org.ron.c130.exercises;

import javax.swing.*;

public class MVCExample {

    public MVCExample() {
        JFrame frame = new JFrame("MVC Example");
        JTable table = new JTable(new MyTM());
        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MVCExample::new);
    }
}
