/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;
import java.awt.Color;

public class SnowflakeMaker implements Directions
{
    private static String world = "Blank"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        MileWalker karel1 = new MileWalker(15, 15, North, infinity); 
        MileWalker karel2 = new MileWalker(15, 15, North, infinity); 
        MileWalker karel3 = new MileWalker(15, 15, North, infinity); 
        MileWalker karel4 = new MileWalker(15, 15, North, infinity); 
        MileWalker karel5 = new MileWalker(15, 15, North, infinity); 
        MileWalker karel6 = new MileWalker(15, 15, North, infinity); 
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        World.setBeeperColor(Color.cyan);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
