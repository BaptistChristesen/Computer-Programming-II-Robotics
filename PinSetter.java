import kareltherobot.*;
import java.awt.Color;

public class PinSetter implements Directions
{
    private static String world = "PinSetter"; // insert the world name between the quotes
    private static int delay = 3;
    
    public static void main(String args[])  {
        MileWalker karel = new MileWalker(1, 5, North, 10); 
        karel.moveBeepDown();
        karel.moveLeft();
        karel.moveBeepDown();
        karel.moveRight();
        karel.moveBeepDown();
        karel.moveLeft();
        karel.moveBeepDown();
        karel.turnAround();
        karel.move();
        karel.moveBeepDown();
        karel.move();
        karel.moveBeepDown();
        karel.move();
        karel.moveBeepDown();
        karel.turnAround();
        karel.moveLeft();
        karel.moveBeepDown();
        karel.moveRight();
        karel.moveBeepDown();
        karel.moveRight();
        karel.move();
        karel.putBeeper();
        karel.turnAround();
        karel.move();
        karel.move();
        karel.move();
        karel.turnAround();
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