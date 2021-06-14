import greenfoot.*;

public class ChamberLevel1 extends Chamber
{
    private static final int numberOfChambers = 3;

    public ChamberLevel1()
    {
        NonScrollingBackground background = new NonScrollingBackground("bglv1chamber.jpg");
        this.addObject(background,300,132);
        this.addObject(new ExampleActor(background,50),50,getHeight()/2+6);
        this.addObject(new NonScrollingDoor("door1.png",SupportedScene.CORRIDORLEVEL1),520,112);
        this.setPaintOrder(ExampleActor.class,Door.class);
    }
}
