import kareltherobot.*;
import java.awt.Color;
public class Garden3 extends UrRobot{
    public Garden3(int st,int av,Direction dir,int beeps,Color color){
        super(st,av,dir,beeps,color);
    }
    public void moveBeep(){
        putBeeper(); super.move();
    }
    public void move(){
        super.move();
        for(var i = 0;i < 3;i++){
            moveBeep();
        }
        turnOff();
    }
    
}
