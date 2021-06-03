import greenfoot.*;

public class StartMenu extends Screen
{
    public StartMenu()
    {   
        this.addObject(new NewGameButton(35), 300, 190);
        this.addObject(new HighScoresButton(35), 300, 250);
        this.addObject(new ControlsButton(35), 300, 310);
        this.addObject(new ExitButton(35), 300, 370);
    }
}
