/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;
import java.awt.Color;

public class RobotsTellTime implements Directions
{
    private static String world = "Blank"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        TimeBot karel = new TimeBot(2, 2, North, infinity, Color.blue);
        
        karel.make12();
        karel.reset();
        karel.colon();
        karel.reset();
        karel.make4();
        
        karel.make8();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
