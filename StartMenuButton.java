import greenfoot.*;

public class StartMenuButton extends Button
{      
    private int id;
    private String message;

    public StartMenuButton(String message,int textSize,int id)
    {
        this.message = message;
        this.setImage(new GreenfootImage(message,textSize,Color.WHITE,Color.BLACK,Color.WHITE));
        this.id = id;
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
        switch(id){
            case 1:
            //Iniciar el primer nivel
            break;
            case 2:
            //Preguntar sobre archivo de guardado
            break;
            case 3:
            Greenfoot.setWorld(new HighScores());
            break;
            case 4:
            Greenfoot.setWorld(new Controls());
            break;
            case 5:
            Greenfoot.stop();
            break;
        }
    }
}
