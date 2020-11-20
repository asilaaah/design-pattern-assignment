
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
//   private boolean trishaw = true;
//   private boolean bus = true;
//   private boolean fireworks = true;
//   private boolean hibiscus = true;
//   private boolean lights= true;
   
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
      
      if(klcc){
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

      }//if klcc
      
       if(lights)
      {
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
    
         
 
      }//if lights 
       
      if(bus)
      {
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
 
      }//if bus
 
      if(trishaw)
      {
        //add trishaw
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("trishaw.png");  
        g.drawImage(i,610,520,this);  

      }//if trishaw
      
       if(hibiscus)
      {
        //add hibiscus
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("hibiscus.png");  
        g.drawImage(i,700,60,this);  

      }//if hibiscus
       
      if(menaraKL){
        Color LIGHT_GRAY = new Color(204,204,204);
        Color WHITE = new Color(255,255,255);
        
        g.setColor(LIGHT_GRAY);
        g.fillRect(510, 171, 80, 50);
        g.fillRect(535, 171, 30, 215);
        g.fillRect(550, 120, 3, 60);
        g.fillOval(541, 100, 20, 20);
        g.setColor(WHITE);
        g.fillRect(510, 182, 80, 28);
      }//if menara kl
 
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
         menaraKL = false;
         klcc = false;
         bus = false;
         trishaw = false;
         music = false;
         fireworks = true;
         hibiscus = false;
         lights= false;
         repaint();
 
      }//if firework
 
      else if(event.getSource()==busButton)
      {
         menaraKL = false;
         klcc = false;
         fireworks = false;
         trishaw = false;
         music = false;
         bus = true;
         hibiscus = false;
         lights = false;
         repaint();
 
      }//if bus
 
      else if(event.getSource()==trishawButton)
      {
         menaraKL = false;
         klcc = false;
         fireworks = false;
         bus = false;
         music = false;
         trishaw = true;
         hibiscus= false;
         lights = false;
         repaint();
 
      }//if trishaw
      
      else if(event.getSource()==menaraKLButton)
      {
         menaraKL = true;
         klcc = false;
         fireworks = false;
         bus = false;
         music = false;
         trishaw = false;
         hibiscus= false;
         lights= false;
         repaint();
 
      }//if menaraKL
      
      else if(event.getSource()==hibiscusButton)
      {
         menaraKL = false;
         klcc = false;
         fireworks = false;
         bus = false;
         music = false;
         trishaw = false;
         hibiscus= true;
         lights= false;
         repaint();
 
      }//if hibiscus
      
      else if(event.getSource() == musicButton)
      {
          menaraKL = false;
          klcc = false;
          fireworks = false;
          bus = false;
          music = true;
          trishaw = false;
          hibiscus = false;
          lights= false;
          repaint();
          playSound("lagu.wav");
      }//if music
 
      else if(event.getSource()==lightsButton)
      {
         menaraKL = false;
         klcc = false;
         fireworks = false;
         bus = false;
         music = false;
         trishaw = false;
         hibiscus= false;
         lights= true;
         repaint();
 
      }//if lights
      
      else if(event.getSource()==klccButton)
      {
         menaraKL = false;
         klcc = true;
         fireworks = false;
         bus = false;
         music = false;
         trishaw = false;
         hibiscus= false;
         lights= false;
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
