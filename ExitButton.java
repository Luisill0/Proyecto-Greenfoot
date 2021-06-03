import greenfoot.*;

public class ExitButton extends StartMenuButton
{   
    public ExitButton(String message, int textSize){
        this.message = message;
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
