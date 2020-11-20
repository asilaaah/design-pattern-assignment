/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;


public class Lights extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //draw lights
         g.setColor(Color.orange);
         g.fillOval(330,445,15,15);
         g.fillOval(350,440,15,15);
         
         g.fillOval(480,405,15,15);
         g.fillOval(500,400,15,15);
         g.fillOval(520,395,15,15);
         g.fillOval(540,390,15,15);
         g.fillOval(560,385,15,15);
         g.fillOval(580,380,15,15);
         
         g.fillOval(620,295,15,15);
         g.fillOval(640,290,15,15);
         g.fillOval(660,285,15,15);
   }
    
}
