import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Text extends Actor
{   
   private String text;

   public Text(String text,int size){
        this.text = text;
        this.setImage(new GreenfootImage(text,size,Color.WHITE,Color.BLACK));
   }

   public Text() {}

   public void act() {}   
    
   public String getText(){
        return text;
   }

   public void setText(String text){
        this.text = text;
   }
}
