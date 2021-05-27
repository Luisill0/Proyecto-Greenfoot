import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Controls extends StartMenu
{
    public Controls()
    {
        this.addObject(new Text("Controls",30),300,100);
        this.removeObjects(this.getObjects(Button.class));
    }
}
