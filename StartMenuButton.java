import greenfoot.*;

public abstract class StartMenuButton extends Button
{      
    protected String message;
    
    protected class ButtonFrame extends Actor{
        
        ButtonFrame(){
            setImage(new GreenfootImage("Button Frame - StartMenu.png"));
        }
    }
    
    protected abstract void changeScreen();
}
