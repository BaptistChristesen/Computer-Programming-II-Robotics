import kareltherobot.*;

public class LineBot extends UrRobot{
      public LineBot (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      public void move(){
          moveBeepDown(); moveBeepDown(); moveBeepDown(); moveBeepDown(); moveBeepDown(); super.move(); turnOff();
        
        }
      public void moveBeepDown ()
       {
         super.move();
         putBeeper();
       }
}
