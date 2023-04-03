import kareltherobot.*;

public class Hbot extends UrRobot{
      public Hbot (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      
      public void moveBeepDown ()
         {
         super.move();
         putBeeper();
         }
      public void move()
      {
        super.move(); super.move(); moveBeepDown(); super.move(); super.move(); super.move(); turnOff();  
        }
}
