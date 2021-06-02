import greenfoot.*;

public class HighScores extends Screen
{
    public HighScores()
    {
        this.addObject(new TextDisplayer("High Scores",30),300,100);
        this.addObject(new ReturnButton(new StartMenu(),30),35,10);
    }
}