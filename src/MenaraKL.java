/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;


public class MenaraKL extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //draw menara KL
        Color LIGHT_GRAY = new Color(204,204,204);
        Color WHITE = new Color(255,255,255);
        
        g.setColor(LIGHT_GRAY);
        g.fillRect(510, 171, 80, 50);
        g.fillRect(535, 171, 30, 215);
        g.fillRect(550, 120, 3, 60);
        g.fillOval(541, 100, 20, 20);
        g.setColor(WHITE);
        g.fillRect(510, 182, 80, 28);

   }
    
}
