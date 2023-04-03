import kareltherobot.*;

public class Plant extends UrRobot{
      public Plant (int st,int av,Direction dir,int beeps){
          super(st,av,dir,beeps);
        }
      public void turnAround(){
          turnLeft(); turnLeft();
        }
      public void moveThree(){
          move(); move(); move();
        }
      public void threeLeft(){
          moveThree(); turnLeft();
        }
      public void garden1(){
          threeLeft();
          moveThree();
          putBeeper();
          turnAround();
          threeLeft();
          move();
          threeLeft();
        }
      public void garden4(){
          for(var i=0;i < 4;i++){
              garden1();
            }
        }
}