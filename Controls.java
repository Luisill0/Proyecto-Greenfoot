import greenfoot.*;

public class Controls extends Screen
{
    public Controls()
    {   
        this.addObject(new TextDisplayer("Controls",30),300,100);
        this.addObject(new ReturnButton(new StartMenu(),30),35,10);
    }
}
