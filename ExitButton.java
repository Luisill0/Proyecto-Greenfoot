import greenfoot.*;

public class ExitButton extends StartMenuButton
{   
    private static final String message = "Exit";

    public ExitButton(int textSize){
        this.setImage(new GreenfootImage(message,textSize,Color.WHITE,Color.BLACK,Color.WHITE));
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
       Greenfoot.stop();
    }
}
