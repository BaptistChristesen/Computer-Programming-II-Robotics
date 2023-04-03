

/**
   @Author: (put your name here)
      Date: (put the date here)
  */

import kareltherobot.*;
import java.awt.Color;

public class SeventeenRobotsSayHello implements Directions
{
    private static String world = "Blank"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        LineBot karel1 = new LineBot(2,2,North,infinity);
        Hbot karel2 = new Hbot(2,3,North,infinity);
        Hbot karel3 = new Hbot(2,4,North,infinity);
        LineBot karel4 = new LineBot(2,5,North,infinity);
        LineBot karel5 = new LineBot(2,7,North,infinity);
        EBot karel6 = new EBot(2,8,North,infinity);
        EBot karel7 = new EBot(2,9,North,infinity);
        LineBot karel8 = new LineBot(2,11,North,infinity);
        BtmBot karel9 = new BtmBot(2,12,North,infinity);
        BtmBot karel10 = new BtmBot(2,13,North,infinity);
        LineBot karel11 = new LineBot(2,15,North,infinity);
        BtmBot karel12 = new BtmBot(2,16,North,infinity);
        BtmBot karel13 = new BtmBot(2,17,North,infinity);
        LineBot karel14 = new LineBot(2,19,North,infinity);
        Obot karel15 = new Obot(2,20,North,infinity);
        Obot karel16 = new Obot(2,21,North,infinity);
        LineBot karel17 = new LineBot(2,22,North,infinity);
        
        karel1.move();
        karel2.move();
        karel3.move(); 
        karel4.move();
        
        karel5.move();
        karel6.move();
        karel7.move();
        
        karel8.move();
        karel9.move();
        karel10.move();
        
        karel11.move();
        karel12.move();
        karel13.move();
        
        karel14.move();
        karel15.move();
        karel16.move();
        karel17.move();
        
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
