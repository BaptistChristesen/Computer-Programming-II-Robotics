import kareltherobot.*;

public class Obot extends UrRobot{
      public Obot (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      
      public void moveBeepDown ()
         {
         super.move();
         putBeeper();
         }
      public void move()
      {
        moveBeepDown(); super.move(); super.move(); super.move();  moveBeepDown(); super.move(); turnOff();
        }
}
