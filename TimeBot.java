 import kareltherobot.*;
 import java.awt.Color;
public class TimeBot extends UrRobot{
      public TimeBot (int st,int av,Direction dir,int beeps,Color color){
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
         public void make1 ()
         { 
         
          putBeeper();
          move();
          putBeeper();
          move();
          putBeeper();
          move();
          putBeeper();
          move();
          putBeeper();
             
            }
         public void reset ()
         {
             turnRight();
             move();
             turnRight();
             move();
             move();
             move();
             move();
             turnLeft();
             move();
             turnLeft();
             
            }
         public void make2 ()
         {
             
             turnRight();
             move();
             move();
             move();
             turnLeft();
             turnLeft();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             move();
             turnRight();
             putBeeper();
             move();
             putBeeper();
             move();
             turnRight();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             turnLeft();
             move();
             putBeeper();
             move();
             putBeeper();
             turnLeft();
             move();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             turnAround();
             move();
             move();
             move();
             turnLeft();
            }
            public void make12()
            {
            make1();
            reset();
            make2();
        }
        public void make0()
        {
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         move();
         move();
         move();
         turnLeft();
        }
        public void make10()
        {
         make1();
         reset();
         make0();
        }
        public void make3()
        {
        turnRight();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        move();
        move();
        turnAround();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        turnAround();
        move();
        move();
        move();
        move();
        turnLeft();
        }    
        public void make11()
        {
            turnAround();
            move();
            turnAround();
            make1();
            reset();
            turnAround();
            move();
            
            turnAround();
            
           
            make1();
        }
        public void make5 ()
         {
             
             turnRight();
             
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             move();
             turnLeft();
             putBeeper();
             move();
             putBeeper();
             move();
             turnLeft();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             turnRight();
             move();
             putBeeper();
             move();
             putBeeper();
             turnRight();
             move();
             putBeeper();
             move();
             putBeeper();
             move();
             putBeeper();
             turnLeft();
            }
            public void make8()
        {
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
        
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         move();
         move();
         move();
         turnLeft();
        }
            public void make9()
        {
         putBeeper();
         move();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
        
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         move();
         move();
         move();
         turnLeft();
        }
        public void make7 (){
            turnRight();
            move();
            move();
            turnLeft();
            make1();
            turnLeft();
            move();
            putBeeper();
            move();
            putBeeper();
            turnAround();
            move();
            move();
            turnLeft();
        }
        public void colon () {
         move();
         putBeeper();
         move();
         move();
         putBeeper();
         move();
        }
        public void make6()
        {
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
        
         move();
         putBeeper();
         turnRight();
         move();
         
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         move();
         move();
         move();
         turnLeft();
        }
            public void make4()
        {
          
        
         
         move();
         
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnAround();
         move();
         move();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();
         
         move();
         
        
         move();
         putBeeper();
         turnRight();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         turnRight();
         move();

         move();
         
         move();
         
         turnAround();
         move();
         move();
         move();
         move();
         move();
         turnLeft();
        
        }
}
