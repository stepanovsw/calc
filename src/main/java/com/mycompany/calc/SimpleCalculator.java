/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calc;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 *
 * @author adminctri
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        //1. Create a panel
        JPanel windowContent = new JPanel();
        
        //2. Set a layout manager for this panel
        GridLayout g1 = new GridLayout(4,2);
        windowContent.setLayout(g1);
        
        //3. Create controls in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
        
        //4. Add controls to the panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        
        //5. Create the frame and add the panel to it
        JFrame frame = new JFrame("My First Calculator");
        
        //6 Add the panel
       frame.setContentPane(windowContent);
        
        //7. set the sixe
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setResizable(false);
  
    }
    
}
