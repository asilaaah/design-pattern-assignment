/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsanimation;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
 
public class LightsAnimation {
    private Timer timer;
     
    public class Drawing extends JPanel {
 
        private int x = 125;
        private int y = 80;
        private boolean changeColors = false;
 
 
        public void paintComponent(Graphics g) {
 
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            
 
            //drawing the shapes
            Ellipse2D.Double ball = new Ellipse2D.Double(x, y, 100, 100);
            g2.draw(ball);
            
            //coloring the shapes
            g2.setColor(Color.ORANGE);
            g2.fill(ball);
 
            changeColors = !changeColors;
 
            if (changeColors) {
                g2.setColor(Color.darkGray);
                g2.fill(new Ellipse2D.Double(x, y, 100, 100));
            }
 
            
        }
 
        public void changeColors() {
            changeColors = true;
            repaint();
        }
    }
 
    public LightsAnimation() {
        //Creation of frame
        JFrame frame = new JFrame();
        frame.setSize(350, 570);
        frame.setTitle("Light Animation");
        frame.setLayout(new BorderLayout(0, 0));
        final Drawing shapes = new Drawing();
 
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapes.repaint();
            }
        });
 
        JButton jbtFlash = new JButton("Flash");
        jbtFlash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start(); 
            }
        });
        final JButton jbtSteady = new JButton("Steady");
        jbtSteady.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                     
                    timer.stop();
                     
                   
                 
                }
            });
 
        //Positioning
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1, 2, 0, 0));
        controlPanel.add(jbtFlash);
        controlPanel.add(jbtSteady);
 
        frame.add(controlPanel, BorderLayout.SOUTH);
        frame.add(shapes);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // in last line here, start the timer:
        timer.start(); 
    }
 
    public static void main(String[] args) {
        new LightsAnimation();
    }
}