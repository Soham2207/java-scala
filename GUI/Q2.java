package com.mycompany.clg_exp;

import java.awt.*;
import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.Vector;

import javax.swing.*;

public class Q2 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Register");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new GridLayout(6, 2, 10, 10));
        JLabel j1 = new JLabel("Name");
        f.add(j1);
        JTextField jt1 = new JTextField(10);
        f.add(jt1);
        JLabel j2 = new JLabel("EmailID");
        f.add(j2);
        JTextField jt2 = new JTextField(10);
        f.add(jt2);
        JLabel j3 = new JLabel("PhoneNO");
        f.add(j3);
        JTextField jt3 = new JTextField(10);
        f.add(jt3);
        JLabel j4 = new JLabel("Username");
        f.add(j4);
        JTextField jt4 = new JTextField(10);
        f.add(jt4);
        JLabel j5 = new JLabel("Password");
        f.add(j5);
        JTextField jt5 = new JTextField(20);
        f.add(jt5);
        JButton jb1 = new JButton("Register Now");
        f.add(jb1);

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // convert string to int array
                String str = jt1.getText();
                String str1 = jt2.getText();
                String str2 = jt3.getText();
                String str3 = jt4.getText();
                String str4 = jt5.getText();
                if (str.length() == 0 || str1.length() == 0 || str2.length() == 0 || str3.length() == 0
                        || str4.length() == 0) {
                    JOptionPane.showMessageDialog(f, "Please fill all the fields");
                } else {
                    JOptionPane.showMessageDialog(f, "Registered Successfully");
                }
            }
        });

    }
}
