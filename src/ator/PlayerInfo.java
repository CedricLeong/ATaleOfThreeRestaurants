/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * A component with a red box in the center.
 */
public class PlayerInfo extends JPanel {
    
        PlayerInfo() {
        Dimension g = new Dimension(800,270);
        this.setPreferredSize(g);
        System.out.println("label 1");
    }
    @Override
    public void paintComponent(Graphics g) {
        // Draw Shapes 
        Graphics2D g2 = (Graphics2D) g;
        Dimension size = getSize();

        int rX = (size.width - 50)/2;
        int rY = (size.height - 50)/2;
        
        g2.drawRect(rX, rY, 340, 100);
        g2.drawString("This will show information graphically to the user!",390,165);
       // the syntax of drawRect is (x1,y1,w,h)
       //    where (x1,y1) is position of the top left corner and
       //    w and h are width and height respectively
       
       // draw a boundary 
       g2.drawRect(5,5,250,250);
       
       // the syntax of drawOval is (x1,y1,w,h)
       //    where (x1,y1) is the top left corner  and
       //    (w,h) is the width and height of the bounding rectangle
	
       // the head
       g2.drawOval(90,60,20,20);
       
       // the syntax of drawLine is (x1,y1,x2,y2);
       // to draw a line from point (x1,y1) to (x2,y2)
       
       // the body
       g2.drawLine(100,80,100,120);
       
       // the hands
       g2.drawLine(100,100,80,100);
       g2.drawLine(100,100,120,75);
       
       // the legs
       g2.drawLine(100,120,85,135);
       g2.drawLine(100,120,115,135);
       
       // the greeting
       g2.drawString("Hi there", 20, 180);
        
        // Draw Text
        g2.drawString("This displays information in a fun way!",10,20);
    }
}