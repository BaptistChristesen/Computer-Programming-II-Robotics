/**
   @Author: (name)
      Date: (put the date here)
  */

import kareltherobot.*;

public class Abstract implements Directions
{
    private static String world = "Blank"; // insert the world name between the quotes
    private static int delay = 7;
    
    public static void main(String args[])  {
        TwoRows Two1 = new TwoRows(1,1,East,8); Two1.layBeepers();
        TwoRows Two2 = new TwoRows(3,1,East,8); Two2.layBeepers();
        TwoRows Two3 = new TwoRows(5,1,East,8); Two3.layBeepers();
        ThreeRows Three1 = new ThreeRows(2,1,East,12); Three1.layBeepers();
        ThreeRows Three2 = new ThreeRows(4,1,East,12); Three2.layBeepers();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
