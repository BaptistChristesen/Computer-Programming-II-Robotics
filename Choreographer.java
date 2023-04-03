/**
   @Author: (name)
      Date: (put the date here)
  */

import kareltherobot.*;

public class Choreographer implements Directions
{
    private static String world = "Gardener"; // insert the world name between the quotes
    private static int delay = 6;
    
    public static void main(String args[])  {
        ChoreographMethods TimK = new ChoreographMethods(6,6,East,7);
        TimK.plant();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
