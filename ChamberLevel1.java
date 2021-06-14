import greenfoot.*;

public class ChamberLevel1 extends Chamber
{
    private static final int numberOfChambers = 4;

    public ChamberLevel1()
    {
        NonScrollingBackground background = new NonScrollingBackground("bglv1chamber.jpg");
        this.addObject(new ReturnButton(new StartMenu(),20),50,50);
        this.addObject(background,300,132);
        this.addObject(new ExampleActor(background,50),50,getHeight()/2+6);
        this.addObject(new NonScrollingDoor("door1.png",SupportedScene.CORRIDORLEVEL1),520,112);
        this.setPaintOrder(ExampleActor.class,Door.class);
    }
    
    /** For testing purposes only */
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            System.out.println("chambersPassed = " + Chamber.chambersPassed);
        }
    }
}
