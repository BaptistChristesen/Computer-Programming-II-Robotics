
/**
 * Abstract class BeeperLayer - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import kareltherobot.*;
public abstract class BeeperLayer extends UrRobot{
    public BeeperLayer(int st,int av, Direction dir, int beep){
        super(st,av,dir,beep);
    }
    public abstract void putBeepers();
    public void moveBeep(){
        move(); putBeepers(); move(); putBeepers();
    }
    public void layBeepers(){
        moveBeep(); moveBeep(); move(); turnOff();
    }
}
