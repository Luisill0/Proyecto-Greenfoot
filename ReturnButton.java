import greenfoot.*;

public class ReturnButton extends Button
{
    private World previous;
    private static final String message = "Return";

    public ReturnButton(World previous,int textSize)
    {
        this.previous = previous;
        this.setImage(new GreenfootImage(message,textSize,Color.BLACK,Color.WHITE));
    }   

    public void act() 
    {
        if(isClicked())
        {
            changeScreen();
        }
    }    

    protected void changeScreen()
    {
        Greenfoot.setWorld(previous);
    }
}
