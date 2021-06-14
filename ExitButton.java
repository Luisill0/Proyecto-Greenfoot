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
           exitGame();
        }
    }    
    
    protected void changeScreen(){}
    
    protected void exitGame()
    {
       Greenfoot.stop();
    }
}
