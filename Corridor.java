import greenfoot.*;

public abstract class Corridor extends Scene
{ 
   protected static int corridorsPassed = 0;
   
   public Corridor(){
       super(600,400,1,false);      
       corridorsPassed++;
       this.addObject(new TextDisplayer("Corridor: " + corridorsPassed,20),298,275);
   }   
}
