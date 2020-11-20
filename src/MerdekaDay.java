/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
 
public class MerdekaDay extends JFrame implements ActionListener
{
   //Buttons
   private JButton fireworkButton;
   private JButton klccButton;
   private JButton menaraKLButton;
   private JButton trishawButton;
   private JButton busButton;
   private JButton musicButton;
   private JButton addAllButton;
   private JButton exitButton;
   private JButton hibiscusButton;
   private JButton lightsButton;
 
   //Panels
   private JPanel titlePanel, imagePanel, buttonPanel, infoPanel;
 
   //Labels
   private JLabel title, imageLabel, buttonLabel;
 
   //Image
   private ImageIcon image;
 
   //Boolean
   private boolean klcc = false;
   private boolean menaraKL = false;
   private boolean trishaw = false;
   private boolean bus = false;
   private boolean fireworks = false;
   private boolean music = false;
   private boolean hibiscus = false;
   private boolean lights = false;
 
   public MerdekaDay()
   {
      //Set title
      setTitle("Let's celebrate Malaysia Independence Day!");
 
      setLayout(new BorderLayout());
 
      //Setting the title of the JLabel
      title = new JLabel("Click on the button to add your way of celebrating Independence Day.");
 
      //Setting the font
      title.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 15));
 
      //Setting the text colour to red and positioning it to the centre
      title.setForeground(Color.red);
      title.setHorizontalAlignment(SwingConstants.CENTER);
 
      //Creating a new JPanel and adding the title label to it
      titlePanel = new JPanel();
      titlePanel.add(title);
 
      //Setting colour of title panel
      titlePanel.setBackground(Color.white);
 
      //Creating a new JPanel for the image to go
      imagePanel = new JPanel();
 
      //Retrieving image from the file
      image = new ImageIcon("background.jpg");          
                
      //Adding the image to a label
      imageLabel = new JLabel(image);

      //Adding image label to the image panel
      imagePanel.add(imageLabel);
 
      //Setting colour of image panel
      imagePanel.setBackground(Color.white);
 
      //Creating a new JPanel for the buttons to go
      buttonPanel = new JPanel();
 
      //Setting colour of button panel
      buttonPanel.setBackground(Color.white);
 
      //Button Label
     // buttonLabel = new JLabel("Click on the button to add the item to the tree.");
      buttonLabel = new JLabel("");
      buttonLabel.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      buttonLabel.setForeground(Color.red);
      buttonLabel.setHorizontalAlignment(SwingConstants.CENTER);
      buttonLabel.setBackground(Color.white);
 
      //Info panel
      infoPanel = new JPanel();
      infoPanel.add(buttonLabel);
      infoPanel.setBackground(Color.white);
 
     //Naming buttons
      fireworkButton = new JButton("Fireworks");
      lightsButton = new JButton("Lights");
      klccButton = new JButton("KLCC");
      menaraKLButton = new JButton("KL Tower");
      trishawButton = new JButton("Trishaw");
      busButton = new JButton("Bus");
      hibiscusButton = new JButton("Hibiscus");
      musicButton = new JButton("Play Music");
      addAllButton = new JButton("Add All");
      exitButton = new JButton("Exit");
 
     //Setting colour of buttons
      fireworkButton.setBackground(Color.red);
      lightsButton.setBackground(Color.red);
      klccButton.setBackground(Color.red);
      menaraKLButton.setBackground(Color.red);
      busButton.setBackground(Color.red);
      trishawButton.setBackground(Color.red);
      hibiscusButton.setBackground(Color.red);
      musicButton.setBackground(Color.red);
      addAllButton.setBackground(Color.red);
      exitButton.setBackground(Color.red);
 
      //Setting font on buttons
      fireworkButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      lightsButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      klccButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      busButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
      menaraKLButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
      trishawButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      hibiscusButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      musicButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      addAllButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
      exitButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
 
      //Setting font colour on buttons
      fireworkButton.setForeground(Color.white);
      lightsButton.setForeground(Color.white);
      klccButton.setForeground(Color.white);
      menaraKLButton.setForeground(Color.white);
      busButton.setForeground(Color.white);
      trishawButton.setForeground(Color.white);
      hibiscusButton.setForeground(Color.white);
      musicButton.setForeground(Color.white);
      addAllButton.setForeground(Color.white);
      exitButton.setForeground(Color.white);
 
      //Add the buttons to the buttonPanel
      buttonPanel.add(fireworkButton);
      buttonPanel.add(lightsButton);
      buttonPanel.add(klccButton);
      buttonPanel.add(menaraKLButton);
      buttonPanel.add(busButton);
      buttonPanel.add(trishawButton);
      buttonPanel.add(hibiscusButton);
      buttonPanel.add(musicButton);
      buttonPanel.add(addAllButton);
      buttonPanel.add(exitButton);
 
      //Enable buttons to listen for a mouse-click
      fireworkButton.addActionListener(this);
      lightsButton.addActionListener(this);
      klccButton.addActionListener(this);
      menaraKLButton.addActionListener(this);
      busButton.addActionListener(this);
      trishawButton.addActionListener(this);
      hibiscusButton.addActionListener(this);
      musicButton.addActionListener(this);
      addAllButton.addActionListener(this);
      exitButton.addActionListener(this);
 
      //Positioning Panels
      add(titlePanel, BorderLayout.NORTH);
      add(imagePanel, BorderLayout.CENTER);
      imagePanel.add(infoPanel, BorderLayout.NORTH);
      add(buttonPanel, BorderLayout.SOUTH);
 
      //Configure the frame
      getContentPane().setBackground(Color.white);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1000, 650);
      setLocation(300,40);
      setVisible(true);
 
   }//Constructor
 
   @Override
   public void paint(Graphics g)
   {
      //Call the paint method of the superclass
      super.paint(g);
 
   }
   
   public void playSound(String soundName){}
    
   private static MerdekaDay deco;
 
   //Coding the event-handling routine
   public void actionPerformed(ActionEvent event)
   {
 
      if(event.getSource()==fireworkButton)
      {
         deco = new Fireworks();
         repaint();
 
      }//if firework
 
      else if(event.getSource()==busButton)
      {
         deco = new Bus();
         repaint();
 
      }//if bus
 
      else if(event.getSource()==trishawButton)
      {
         deco = new Trishaw();
         repaint();
 
      }//if trishaw
      
      else if(event.getSource()==menaraKLButton)
      {
         deco = new MenaraKL();
         repaint();
 
      }//if menaraKL
      
      else if(event.getSource()==hibiscusButton)
      {
         deco = new Hibiscus();
         repaint();
 
      }//if hibiscus
      
      else if(event.getSource() == musicButton)
      {
          deco = new Music();
          repaint();
          playSound("lagu.wav");
      }//if music
 
      else if(event.getSource()==lightsButton)
      {
         deco = new Lights();
         repaint();
 
      }//if lights
      
      else if(event.getSource()==klccButton)
      {
         deco = new KLCC();
         repaint();
 
      }//if klcc
            
      else if(event.getSource()==addAllButton)
      {
         menaraKL = true;
         klcc = true;
         fireworks = true;
         bus = true;
         music = true;
         trishaw = true;
         hibiscus = true;
         lights = true;
         repaint();
         playSound("lagu.wav");
      }//if add all
 
      else
      {
         System.exit(0);
 
      }//else exit
 
   } //actionPerformed
 
   public static void main(String[] args)
   {
      MerdekaDay gui = new MerdekaDay();
      
   }//main
 
}//class
