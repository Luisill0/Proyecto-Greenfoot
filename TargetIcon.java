import greenfoot.*;

public class TargetIcon extends Actor
{
    private boolean visible = false;
    private GreenfootImage icon;
    private Enemy enemyTargeted;
    
    public TargetIcon(Enemy enemyTargeted){
        this.enemyTargeted = enemyTargeted;
        icon = new GreenfootImage("targeticon.png");
    }
    
    public void act(){
        icon.setTransparency(visible ? 255:0);
        this.setImage(icon);
    }        
    
    private boolean isClicked(){
        return Greenfoot.mouseClicked(this);
    }
    
    public void setVisibility(boolean visible){
        this.visible = visible;
    }
    
    public Enemy getTarget(){
        return this.enemyTargeted;
    }
}
