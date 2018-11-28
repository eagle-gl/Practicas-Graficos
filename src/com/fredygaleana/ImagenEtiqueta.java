/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fredygaleana;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fredy
 */
public class ImagenEtiqueta extends JFrame{

    public ImagenEtiqueta() {
        JLabel etiqueta = new JLabel(new ImageIcon("Andy.jpeg"));
        JButton bt = new JButton(new ImageIcon("Andy.jpeg"));
        
        etiqueta.setBounds(100, 400, 100, 100);
        bt.setBounds(100, 200, 50, 50);
        bt.setSize(200,100);
        add(bt);
        add(etiqueta);
        
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
