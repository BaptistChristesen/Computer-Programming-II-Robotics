import kareltherobot.*;
import java.awt.Color;
public class FiveRobotsTellTime implements Directions
{
    private static String world = "Blank"; // insert the world name between the quotes
    private static int delay = 10;
    
    public static void main(String args[])  {
        TimeBot karel1 = new TimeBot(2,2,North,infinity,Color.red);
        TimeBot karel2 = new TimeBot(2,8,North,infinity,Color.orange);
        TimeBot karel3 = new TimeBot(2,14,North,infinity,Color.yellow);
        TimeBot karel4 = new TimeBot(2,17,North,infinity,Color.green);
        TimeBot karel5 = new TimeBot(2,23,North,infinity,Color.blue);
        karel1.make0();
        karel2.make9();
        karel3.colon();
        karel3.reset();
        karel4.make5();
        karel4.reset();
        karel5.make2();
        karel5.reset();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        World.setBeeperColor(Color.red);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
