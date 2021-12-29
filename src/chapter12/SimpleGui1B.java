package chapter12;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    JButton button;
    MyDrawPanel panel;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        // creates button, assigns listener, adds to frame
//        button = new JButton("click me");
//        button.addActionListener(this);
//        frame.getContentPane().add(button);

        // creates panel, adds to frame
        panel = new MyDrawPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
