import kareltherobot.*;
import java.awt.Color;
public class Garden4 extends UrRobot{
    public Garden4(int st,int av,Direction dir,int beeps,Color color){
        super(st,av,dir,beeps,color);
    }
    public void moveBeep(){
        putBeeper(); super.move();
    }
    public void move(){
        for(var i = 0;i < 4;i++){
            moveBeep();
        }
        turnOff();
    }
    
}
