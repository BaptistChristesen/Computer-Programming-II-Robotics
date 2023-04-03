import kareltherobot.*;

public class Gardener implements Directions
{
    private static String world = "Gardener"; // insert the world name between the quotes
    private static int delay = 9;
    
    public static void main(String args[])  {
        Plant karel = new Plant(2,2,East,4);
        karel.garden4();
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
