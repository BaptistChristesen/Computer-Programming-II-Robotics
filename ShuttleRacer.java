

import kareltherobot.*;

public class ShuttleRacer implements Directions
{
    private static String world = "ShuttleRacer"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        MileWalker karel = new MileWalker(2, 4, North, 0);  
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnRight();
        
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
