import kareltherobot.*;
import java.awt.Color;

public class DiamondHarvester implements Directions
{
    private static String world = "DiamondHarvester"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        MileWalker karel = new MileWalker(1, 5, North, 10); 
        karel.moveBeepUp();
        karel.moveLeft();
        karel.moveBeepUp();
        karel.moveRight();
        karel.moveBeepUp();
        karel.moveLeft();
        karel.moveBeepUp();
        karel.turnAround();
        karel.move();
        karel.moveBeepUp();
        karel.move();
        karel.moveBeepUp();
        karel.move();
        karel.moveBeepUp();
        karel.turnAround();
        karel.moveLeft();
        karel.moveBeepUp();
        karel.moveRight();
        karel.moveBeepUp();
        karel.moveRight();
        karel.moveBeepUp();
        karel.move();
        karel.moveBeepUp();
        karel.turnLeft();
        karel.move();
        karel.moveBeepUp();
        karel.turnRight();
        karel.moveRight();
        karel.moveBeepUp();
        karel.turnLeft();
        karel.moveRight();
        karel.moveBeepUp();
        karel.moveRight();
        karel.moveBeepUp();
        karel.moveLeft();
        karel.moveBeepUp();
        karel.turnRight();
        karel.moveTwo();
        karel.moveTwo();
        karel.moveRight();
        karel.move();
        karel.moveRight();
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
