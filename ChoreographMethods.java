
/**
 * Write a description of class Choreographer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import kareltherobot.*;

//  Author: 
//  Date: 

public class ChoreographMethods extends UrRobot
{   
    public ChoreographMethods(int street, int avenue, 
        Direction direction, int beepers)
    {   
        super(street, avenue, direction, beepers);
    }
    
    private UrRobot bot1 = new UrRobot(5,5,West,7);     
        // the first helper robot
    private UrRobot bot2 = new UrRobot(5,6,South,7); 
        // the second helper robot
    private UrRobot bot3 = new UrRobot(6,5,North,7);
        // the third helper robot
        

        
    public void plant()  // one robot does the moves, 
                         // and the others copy him
    {
        putBeeper();         
        plantThree();
        turnRight();
        plantThree();
        turnLeft(); move(); turnLeft(); move();
        turnOff();
    }
    
    public void plantThree()
    {
        moveBeep(); moveBeep(); moveBeep(); turnLeft(); turnLeft();
        moveThree();
    }
    public void moveThree(){
        move(); move(); move();
    }
    public void moveBeep()
    {
        move(); putBeeper();
    }
    
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void  move()
    {   super.move();
        bot1.move();
        bot2.move();
        bot3.move();
    }
    
    public void  turnLeft()
    {   super.turnLeft();
        bot1.turnLeft();
        bot2.turnLeft();
        bot3.turnLeft();
    }


    public void  turnOff()
    {   super.turnOff();
        bot1.turnOff();
        bot2.turnOff();
        bot3.turnOff();
    }
    
    public void  putBeeper()
    {   super.putBeeper();
        bot1.putBeeper();
        bot2.putBeeper();
        bot3.putBeeper();
    }
    
}