import kareltherobot.*;

public class BtmBot extends UrRobot{
      public BtmBot (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      
      public void moveBeepDown ()
         {
         super.move();
         putBeeper();
         }
      public void move()
      {
        moveBeepDown(); super.move(); super.move(); super.move(); super.move(); super.move(); turnOff();
          
        }
}
