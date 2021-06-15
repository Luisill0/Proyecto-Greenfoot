import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClassTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassTester extends World
{
    Character playerMage = new PlayerMage(0.5,5.0,3.0,6.0);
    /**
     * Constructor for objects of class ClassTester.
     * 
     */
    public ClassTester()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new NonScrollingBackground("Stage - 0.jpg"),300,131);
        addObject(playerMage,35,170);
        addObject(new AbilityDisplayer(playerMage),125,268);
    }
}
