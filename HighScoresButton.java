import greenfoot.*;

public class HighScoresButton extends StartMenuButton
{
    public HighScoresButton(String message, int textSize){
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
        Greenfoot.setWorld(new HighScores());
    }
}
