/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;
import java.awt.Color;

public class ThousandMiles implements Directions
{
    private static String world = "Blank"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        MileWalker karel = new MileWalker (5, 3, North,0);
        karel.moveBackward();
        
        karel.turnRight();
        karel.moveMile();
        karel.turnLeft();
        karel.moveKiloMile();
        karel.turnAround();
        
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}