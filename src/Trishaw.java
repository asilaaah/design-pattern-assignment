/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.Timer;


public class Trishaw extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //add trishaw
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("trishaw.png");  
        g.drawImage(i,610,520,this); 
   }
    
}
//public class Trishaw extends MerdekaDay implements ActionListener, KeyListener 
//{
//Timer t = new Timer (5, this);
//int x = 610, y = 520, velx = 0, vely = 0;
//
//public Trishaw()
//{
//    t.start();
//    addKeyListener(this);
//    setFocusable(true);
//    setFocusTraversalKeysEnabled(false);
//}
//
//public void paint(Graphics g) {
//
//    super.paint(g);
//    Toolkit t=Toolkit.getDefaultToolkit();  
//    Image i=t.getImage("trishaw.png");  
//    g.drawImage(i,x,y,this);
//}
//
//public void actionPerformed (ActionEvent e)
//{
//    repaint();
//    x += velx;
//    y += vely;
//}
//
//public void reverse()
//{
//    velx = -5;
//    vely = 0;
//}
//
//public void forward()
//{
//    velx = 5;
//    vely = 0;
//}
//
//public void reverseEnd()
//{
//    velx = 0;
//    vely = 0;
//}
//
//public void forwardEnd()
//{
//    velx = 0;
//    vely = 0;
//}
//
//public void keyPressed (KeyEvent e)
//{
//    int code = e.getKeyCode();
//    if (code == KeyEvent.VK_RIGHT)
//    {
//        forward();
//    }
//    if (code == KeyEvent.VK_LEFT)
//    {
//        reverse();
//    }
//}
//
//public void keyTyped (KeyEvent e) {}
//
//public void keyReleased (KeyEvent e) 
//{
//    int code = e.getKeyCode();
//    if (code == KeyEvent.VK_RIGHT)
//    {
//        forwardEnd();
//    }
//    if (code == KeyEvent.VK_LEFT)
//    {
//        reverseEnd();
//    }
//}
//}