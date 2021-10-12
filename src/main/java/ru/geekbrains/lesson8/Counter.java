package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private int counter = 0;

    public Counter() {
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 120);
        Font font = new Font("Roboto", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        JButton buttonMinus = new JButton("<");
        buttonMinus.setFont(font);
        add(buttonMinus, BorderLayout.WEST);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                counterValueView.setText(String.valueOf(counter));
            }
        });

        JButton buttonPlus = new JButton(">");
        buttonPlus.setFont(font);
        add(buttonPlus, BorderLayout.EAST);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterValueView.setText(String.valueOf(counter));
            }
        });

        setVisible(true);
    }
}
