import greenfoot.*;

public class ControlsButton extends StartMenuButton
{
    private static final String message = "Controls";
    
    public ControlsButton(int textSize){
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
        Greenfoot.setWorld(new Controls());
    }
}
