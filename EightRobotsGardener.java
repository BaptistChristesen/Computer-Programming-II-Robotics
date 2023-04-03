import kareltherobot.*;
import java.awt.Color;
public class EightRobotsGardener implements Directions
{
    private static String world = "Gardener"; // insert the world name between the quotes
    private static int delay = 12;
    
    public static void main(String args[])  {
        Garden4 karel1 = new Garden4(6,5,West,4,Color.red);
        Garden4 karel2 = new Garden4(5,5,West,4,Color.blue);
        Garden3 karel3 = new Garden3(5,5,South,4,Color.red);
        Garden4 karel4 = new Garden4(5,6,South,4,Color.blue);
        Garden3 karel5 = new Garden3(5,6,East,4,Color.red);
        Garden4 karel6 = new Garden4(6,6,East,4,Color.blue);
        Garden3 karel7 = new Garden3(6,6,North,4,Color.red);
        Garden3 karel8 = new Garden3(6,5,North,4,Color.blue);
        karel1.move(); 
        karel2.move();
        
        karel3.move(); 
        karel4.move();
        
        karel5.move(); 
        karel6.move(); 
        
        karel7.move(); 
        karel8.move();
    } 

    static {
        World.reset(); 
        World.readWorld("Worlds",world + ".kwld"); 
        World.setDelay(delay);  
        World.setVisible(true);
        World.setBeeperColor(Color.pink);
        try {Thread.sleep(3000); } catch (Exception e){};
    }
}
