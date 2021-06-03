import greenfoot.*;

public class StartMenu extends Screen
{
    public StartMenu()
    {   
        this.addObject(new NewGameButton("New Game",35), 300, 190);
        this.addObject(new HighScoresButton("High Scores",35), 300, 250);
        this.addObject(new ControlsButton("Controls",35), 300, 310);
        this.addObject(new ExitButton("Exit",35), 300, 370);
    }
}
