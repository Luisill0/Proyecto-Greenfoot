import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Screen
{


    public GameOver()
    {
        this.addObject(new ReturnButton(new StartMenu(),30),35,10);
        this.addObject(new NewGameButton(35), 300, 280);
        setBackground("GameOver Screen.png");
    }
}
