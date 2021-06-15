import greenfoot.*;

public class NewGameButton extends StartMenuButton
{
    private static final String message = "New Game";
    
    public NewGameButton(int textSize)
    {
        this.setImage(new GreenfootImage(message,textSize,Color.BLACK,Color.WHITE));
    }

    public void act() 
    {
        if(isClicked())
        {
           changeScreen();
        }
    }

    protected void changeScreen(){
       //Iniciar el primer nivel
    }
}
