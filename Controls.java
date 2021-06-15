import greenfoot.*;

public class Controls extends Screen
{
    public Controls()
    {   
        this.addObject(new ReturnButton(new StartMenu(),30),35,10);
        setBackground("Controls Screen.png");
    }
}
