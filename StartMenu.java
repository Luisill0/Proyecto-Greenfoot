import greenfoot.*;

public class StartMenu extends Screen
{
    public StartMenu()
    {   
        this.addObject(new StartMenuButton("New Game",35,1), 300, 130);
        this.addObject(new StartMenuButton("Continue",35,2), 300, 190);
        this.addObject(new StartMenuButton("High Scores",35,3), 300, 250);
        this.addObject(new StartMenuButton("Controls",35,4), 300, 310);
        this.addObject(new StartMenuButton("Exit",35,5), 300, 370);
    }
}
