import kareltherobot.*;

public class EBot extends UrRobot{
      public EBot (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      
      public void moveBeepDown ()
         {
         super.move();
         putBeeper();
         }
      public void move()
      {
        moveBeepDown(); super.move(); moveBeepDown(); super.move(); moveBeepDown(); super.move(); turnOff();
          
        }
}
