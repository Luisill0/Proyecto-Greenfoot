import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class StartMenu extends Game
{
    public StartMenu()
    {   
        this.addObject(new Button("New Game",35,1), 300, 130);
        this.addObject(new Button("Continue",35,2), 300, 190);
        this.addObject(new Button("High Scores",35,3), 300, 250);
        this.addObject(new Button("Controls",35,4), 300, 310);
        this.addObject(new Button("Exit",35,5), 300, 370);
    }
    
    public void act(){
        List<Button> buttons = this.getObjects(Button.class);
        for(Button button : buttons){
            if(Greenfoot.mouseClicked(button)){
                removeObjects(buttons);
                this.addObject(new Button("Button: " + button.getId(),20,6),button.getId()*105,30);
                changeTo(button.getId());
            }
        }
    }
    
    public void changeTo(int id){
        switch(id){
            case 1:
                break;
            case 2:
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
