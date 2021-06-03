import greenfoot.*;

public class NewGameButton extends StartMenuButton
{
    public NewGameButton(String message,int textSize)
    {
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

    protected void changeScreen(){
        //Iniciar el primer nivel
    }
}
