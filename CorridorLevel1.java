import greenfoot.*;

public class CorridorLevel1 extends Corridor
{
    private static final int numberOfCorridors = 2;

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
        PlayerMage playerMage = new PlayerMage().setStats(0.5,5.0,3.0,6.0).setDefaultLocation(35,170);
        this.addObject(playerMage,35,175);
        playerMage.addDisplays();
        this.addObject(new ScrollingDoor("door1.png",background,SupportedScene.CHAMBERLEVEL1),706,112);
        this.setPaintOrder(PlayerMage.class,Door.class);   
    }
}
