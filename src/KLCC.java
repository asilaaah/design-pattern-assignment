/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;


public class KLCC extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //draw klcc
        Color LIGHT_GRAY = new Color(204,204,204);
        Color WHITE = new Color(255,255,255);
        
        g.setColor(LIGHT_GRAY);
        g.fillRect(46, 381, 100, 200);
        g.fillRect(60, 301, 70, 200);
        g.fillRect(76, 241, 40, 200);
        g.fillRect(95, 161, 3, 100);
        g.fillOval(86, 160, 20, 20);

        g.fillRect(220, 381, 100, 200);
        g.fillRect(235, 301, 70, 200);
        g.fillRect(250, 241, 40, 200);
        g.fillRect(270, 161, 3, 100);
        g.fillOval(261, 160, 20, 20);
        
        g.fillRect(145, 430, 77, 30);
        g.setColor(WHITE);
        g.fillRect(145, 430, 77, 5);
        g.fillRect(145, 455, 77, 5);
   }
    
}
