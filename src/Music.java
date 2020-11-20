/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Music extends MerdekaDay{
    
    public void playSound(String soundName)
    {
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
