import greenfoot.*;

public class StartMenu extends Screen
{
    
    public StartMenu()
    {   
        this.addObject(new NewGameButton(35), 300, 180);
        this.addObject(new ControlsButton(35), 300, 230);
        this.addObject(new ExitButton(35), 300, 290);
        setBackground("Kasmar Background.png");
    }
    
    
    public void started(){
        MusicPlayer.reproduceMusic("Music - MainMenu.mp3");
    }
    
    public void stopped(){
        MusicPlayer.stopMusic();
    }
    
}
