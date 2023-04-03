import kareltherobot.*;

public class SnowBot extends UrRobot{
      public SnowBot (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      public void moveMile(){
          move(); move(); move(); move(); move(); move(); move(); move();
        }
      public void turnRight(){
          turnLeft(); turnLeft(); turnLeft();
        }
      public void turnAround(){
          turnLeft(); turnLeft();
        }
      public void moveTwo(){
          move(); move();
        }
      public void moveBackward(){
          turnAround();
          move();
          turnAround();
        }
      public void moveKiloMile(){
        for(var i = 0; i < 1000; i++) {
          moveMile();
         }
        }
         public void moveDiagonally ()
      {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        turnRight();
      }
         public void moveBeepDown ()
         {
         move();
         putBeeper();
         }
         public void moveBeepUp ()
         {
         move();
         pickBeeper();
         }
         public void moveRight ()
         {
             move();
             turnRight();
         }
         public void moveLeft ()
         {
             move();
             turnLeft();
             
         }
}
