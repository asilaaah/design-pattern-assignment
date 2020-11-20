/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Hibiscus extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //add hibiscus
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("hibiscus.png");  
        g.drawImage(i,700,60,this);  

   }
}
