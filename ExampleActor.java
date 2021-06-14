import greenfoot.*;

/**
 * Class used for the sole purpose of testing interactions with the Door class
 * will be removed once the class regarding characters is implemented
*/

public class ExampleActor extends Actor
{       
    private Background background;
    private static final int OFFSET = 4;
    private int posX;

    public ExampleActor(Background background, int posX){
        this.background = background;
        this.posX = posX;
    }

    public void act() 
    {
        move();   
    }    

    private void move(){
        if(background instanceof ScrollingBackground){
            moveInScroll();
        }else{
            if(Greenfoot.isKeyDown("left")){
                setLocation(getX() - OFFSET,getY());
            }
            if(Greenfoot.isKeyDown("right")){
                setLocation(getX() + OFFSET,getY());
            }
        }
    }
    
    private void moveInScroll(){
        if (Greenfoot.isKeyDown("left") && getX() > posX) {
            setLocation(getX() - OFFSET, getY());
        }
        if (Greenfoot.isKeyDown("right") && background.getX() == 0) {
            setLocation(getX() + OFFSET, getY());
        }
    }
    
    public int getPosX(){
        return posX;
    }
}
