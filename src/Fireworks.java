/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Fireworks extends MerdekaDay{
    
    @Override
    public void paint(Graphics g)
   {
       super.paint(g);
       
       //draw fireworks
        int SIZE = 256;
        int a = SIZE / 2;
        int b = a;
        int r = 4 * SIZE / 5;
        int n = 15;

        Graphics2D g2d = (Graphics2D) g; 
        a = 200 / 2;
        b = 200 / 2;
        int m = Math.min(a, b);
        r = 4 * m / 5;
        int r2 = Math.abs(m - r) / 2;
        g2d.setColor(Color.red);
        for (int i = 0; i < n; i++) {
            double t = 2 * Math.PI * i / n;
            int x = (int) Math.round(a + r * Math.cos(t));
            int y = (int) Math.round(b + r * Math.sin(t));
            g2d.fillOval(400 + x - r2, 80+ y - r2, 2 * r2, 2 * r2);
        }

        a = 125 / 2;
        b = 125 / 2;
        int m2 = Math.min(a, b);
        r = 4 * m2 / 5;
        int r3 = Math.abs(m2 - r) / 2;
        g2d.setColor(Color.yellow);
        for (int i = 0; i < n; i++) {
            double t = 2 * Math.PI * i / n;
            int x = (int) Math.round(a + r * Math.cos(t));
            int y = (int) Math.round(b + r * Math.sin(t));
            g2d.fillOval(500 + x - r3, 180+ y - r3, 2 * r3, 2 * r3);
        }

        a = 170 / 2;
        b = 170 / 2;
        int m3 = Math.min(a, b);
        r = 4 * m3 / 5;
        int r4 = Math.abs(m3 - r) / 2;
        g2d.setColor(Color.green);
        for (int i = 0; i < n; i++) {
            double t = 2 * Math.PI * i / n;
            int x = (int) Math.round(a + r * Math.cos(t));
            int y = (int) Math.round(b + r * Math.sin(t));
            g2d.fillOval(50 + x - r4, 120+ y - r4, 2 * r4, 2 * r4);
        }
   }
}
