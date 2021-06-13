import greenfoot.*;

public class CorridorLevel1 extends Corridor
{
    private static final int numberOfCorridors = 3;

    public CorridorLevel1()
    {
        try{
            generateCorridor();
        }catch(EndOfLevelException endOfLevelException){
            Greenfoot.stop(); //Temporary while level 2 is implemented
        }       
    }  
    
    private void generateCorridor() throws EndOfLevelException{
        if(Corridor.corridorsPassed > numberOfCorridors){
            throw new EndOfLevelException();
        }        
        ScrollingBackground background = new ScrollingBackground("bglv1corridor.jpg");
        this.addObject(background,600,132);
        this.addObject(new ExampleActor(background,50),50,getHeight()/2+6);
        this.addObject(new ScrollingDoor("door1.png",background,SupportedScene.CHAMBERLEVEL1),706,112);
        this.setPaintOrder(ExampleActor.class,Door.class);   
    }
    
    /** For testing purposes only */
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            System.out.println("corridorsPassed = " + Corridor.corridorsPassed);
            System.out.println("level width" + this.getWidth());
        }
    }
}
