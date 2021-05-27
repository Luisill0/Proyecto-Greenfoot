import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HighScores extends StartMenu
{
    public HighScores()
    {
        this.addObject(new Text("High Scores",30),300,100);
        this.removeObjects(this.getObjects(Button.class));
    }
}
