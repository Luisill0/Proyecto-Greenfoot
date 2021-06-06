import greenfoot.*;

public abstract class Button extends Actor
{
   protected boolean isClicked()
   {
       return Greenfoot.mouseClicked(this);
   }
}
