
/**
 * Write a description of class ThreeRows here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class ThreeRows extends BeeperLayer{
    public ThreeRows(int st,int av,Direction dir,int beep){
        super(st,av,dir,beep);
    }
    public void putBeepers(){
        putBeeper(); putBeeper(); putBeeper();
    }
}