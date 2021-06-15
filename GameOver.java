import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Screen
{
    public GameOver()
    {
        this.addObject(new ReturnButton(new StartMenu(),30),35,10);
        this.addObject(new NewGameButton(35), 300, 280);
        setBackground("GameOver Screen.png");
    }
}
