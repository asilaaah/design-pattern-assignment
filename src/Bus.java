/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;

public class Bus extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //draw bus
        g.setColor(Color.RED);
        g.fillRect(60, 530, 100, 10);
        g.fillRect(60, 550, 100, 10);
        g.fillRect(60, 570, 100, 10);
        
        g.setColor(Color.WHITE);
        g.fillRect(60, 540, 100, 10);
        g.fillRect(60, 560, 100, 10);
       
        g.setColor(Color.YELLOW);
        g.fillOval(70, 570, 20, 20);
        g.fillOval(130, 570, 20, 20);
        
        g.setColor(Color.BLUE);
        g.fillRect(130, 530, 30, 23);
   }
    
}
