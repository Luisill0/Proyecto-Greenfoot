import greenfoot.*;

public class TextDisplayer extends Actor
{   
   private String text;

   public TextDisplayer(String text,int size)
   {
        this.text = text;
        this.setImage(new GreenfootImage(text,size,Color.WHITE,Color.BLACK));
   }
   
   /** For testing purposes only */
   public void act()
   {
       if(Greenfoot.isKeyDown("tab")){
           System.out.println("x = " + getX() + "  y = " + getY());        
       }
   }
}
