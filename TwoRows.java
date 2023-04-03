
/**
 * Write a description of class TwoRows here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class TwoRows extends BeeperLayer{
    public TwoRows(int st,int av, Direction dir, int beep){
        super(st,av,dir,beep);
    }
    public void putBeepers(){
        putBeeper(); putBeeper();
    }
}
