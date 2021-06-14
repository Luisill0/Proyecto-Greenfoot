import greenfoot.*;

public class ScrollingDoor extends Door
{
    private static final int OFFSET = 4;
    private Background background;

    public ScrollingDoor(String imageName,Background background,SupportedScene sceneToGo){
        super(imageName,sceneToGo);
        this.background = background;
    }

    public void act() 
    {        
        if(canMove()){
            move();
        }
        if(canChange()){
            changeScene();
        }

    }   

    private boolean canMove(){
        return background.getX() <= 172 && getX() >= 534;
    }

    private void move(){
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() + OFFSET, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() - OFFSET, getY());
        }
        adjustPosition();
    }

    private void adjustPosition(){
        if(getX() < 534){
            setLocation(534,getY());
        }    
    }
}
