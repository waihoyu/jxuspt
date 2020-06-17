package com.jxuspt;

import javax.swing.*;
import java.awt.*;

public class SwingLoop extends JFrame {
    public SwingLoop(){
        setBounds(100,100,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c =getContentPane();
        c.setLayout(new GridLayout(4,5,20,20)); 
        //4行5列，水平间距5，竖直间距5；
        for (int i = 0; i <20 ; i++) {
            c.add(new JButton("按钮"+i));
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingLoop();
    }
}