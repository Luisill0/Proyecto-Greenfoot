import greenfoot.*;

public class HighScoresButton extends StartMenuButton
{
    private static final String message = "High Scores";
    
    public HighScoresButton(int textSize){
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
