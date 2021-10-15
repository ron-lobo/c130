package org.ron.c130.exercises;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MVCExample {

    public MVCExample() {
        JFrame frame = new JFrame("MVC Example");
        JTable table = new JTable(new MyTM());

        table.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited");
            }
        });

        frame.add(new JScrollPane(table));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MVCExample::new);
    }
}
