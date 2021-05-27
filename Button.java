import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class Button extends Actor
{
    private String message;
    private int id;
    
    public Button(String message,int textSize,int id){
        this.message = message;
        GreenfootImage text = new GreenfootImage(message,textSize,Color.WHITE,Color.BLACK,Color.WHITE);
        this.setImage(text);
        this.id = id;
    }
    
    public Button(String message,int sizeX, int sizeY,int id){
        this.message = message;
        GreenfootImage text = new GreenfootImage(message,sizeY-5,Color.WHITE,Color.BLACK,Color.WHITE);     
        this.setImage(text);
        this.id = id;
    }

    public void act() 
    {
        
    }    
    
    public int getId(){
        return id;
    }
    
    public String getMessage(){
        return message;
    }
}
