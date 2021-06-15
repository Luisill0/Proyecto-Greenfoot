import greenfoot.*;

public class Chamber extends Scene
{  
    protected static int chambersPassed = 0;
    
    public Chamber()
    {    
        super(600,400,1,true); 
        chambersPassed++;
        this.addObject(new TextDisplayer("Chamber: " + chambersPassed,20),300,275);
    }           
}
