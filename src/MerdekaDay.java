
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
   private JButton presentButton;
   private JButton ornamentButton;
   private JButton musicButton;
   private JButton addAllButton;
   private JButton exitButton;
 
   //Panels
   private JPanel titlePanel, imagePanel, buttonPanel, infoPanel;
 
   //Labels
   private JLabel title, imageLabel, buttonLabel;
 
   //Image
   private ImageIcon image;
 
   //Boolean
//   private boolean presents = true;
//   private boolean ornaments = true;
//   private boolean fireworks = true;
   
   private boolean presents = false;
   private boolean ornaments = false;
   private boolean fireworks = false;
   private boolean music = false;
 
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
      presentButton = new JButton("Presents");
      ornamentButton = new JButton("Ornaments");
      musicButton = new JButton("Play Music");
      addAllButton = new JButton("Add All");
      exitButton = new JButton("Exit");
 
      //Setting colour of buttons
      fireworkButton.setBackground(Color.red);
      ornamentButton.setBackground(Color.red);
      presentButton.setBackground(Color.red);
      musicButton.setBackground(Color.red);
      addAllButton.setBackground(Color.red);
      exitButton.setBackground(Color.red);
 
      //Setting font on buttons
      fireworkButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      ornamentButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
      presentButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      musicButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC, 16));
      addAllButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
      exitButton.setFont(new Font("CENTURY GOTHIC", Font.ITALIC,16));
 
      //Setting font colour on buttons
      fireworkButton.setForeground(Color.white);
      ornamentButton.setForeground(Color.white);
      presentButton.setForeground(Color.white);
      musicButton.setForeground(Color.white);
      addAllButton.setForeground(Color.white);
      exitButton.setForeground(Color.white);
 
      //Add the buttons to the buttonPanel
      buttonPanel.add(fireworkButton);
      buttonPanel.add(ornamentButton);
      buttonPanel.add(presentButton);
      buttonPanel.add(musicButton);
      buttonPanel.add(addAllButton);
      buttonPanel.add(exitButton);
 
      //Enable buttons to listen for a mouse-click
      fireworkButton.addActionListener(this);
      ornamentButton.addActionListener(this);
      presentButton.addActionListener(this);
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
 
      if(fireworks)
      {
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
 
      }//if fireworks
 
      if(ornaments)
      {
         //draw ornaments
         g.setColor(Color.red);
         g.fillOval(220,220,15,15);
         g.fillOval(280,220,15,15);
         g.setColor(Color.blue);
         g.fillOval(320,380,15,15);
         g.fillOval(180,380,15,15);
         g.setColor(Color.cyan);
         g.fillOval(200,300,15,15);
         g.fillOval(300,300,15,15);
 
      }//if ornaments
 
      if(presents)
      {
         //draw presents
         g.setColor(Color.red);
         g.fillRect(320,400,60,60);
         g.fillRect(140,380,30,30);
 
         g.setColor(Color.orange);
         g.fillRect(180,430,40,40);
 
         g.setColor(Color.blue);
         g.fillRect(120,400,60,60);
         g.fillRect(360,440,30,30);
 
      }//if presents
 
   } //paint
   
    public void playSound(String soundName)
    {
        if(music){
        try 
        {
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
         Clip clip = AudioSystem.getClip( );
         clip.open(audioInputStream);
         clip.start( );
        }
        catch(Exception ex)
        {
          System.out.println("Error with playing sound.");
          ex.printStackTrace( );
        }
        }
    }
 
   //Coding the event-handling routine
   public void actionPerformed(ActionEvent event)
   {
 
      if(event.getSource()==fireworkButton)
      {
         ornaments = false;
         presents = false;
         music = false;
         fireworks = true;
         repaint();
 
      }//if firework
 
      else if(event.getSource()==ornamentButton)
      {
         fireworks = false;
         presents = false;
         music = false;
         ornaments = true;
         repaint();
 
      }//if ornament
 
      else if(event.getSource()==presentButton)
      {
         fireworks = false;
         ornaments = false;
         music = false;
         presents = true;
         repaint();
 
      }//if present
      
      else if(event.getSource() == musicButton)
      {
          fireworks = false;
          ornaments = false;
          music = true;
          presents = false;
          repaint();
          playSound("lagu.wav");
      }
 
      else if(event.getSource()==addAllButton)
      {
         fireworks = true;
         ornaments = true;
         music = true;
         presents = true;
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