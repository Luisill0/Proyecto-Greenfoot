import greenfoot.*;

public class ScrollingBackground extends Background
{
    private static final int OFFSET = 4;
    public ScrollingBackground(String image){
        super(image);   
    }

    public void act() 
    {
        move();
    }    

    /** Method for the background to move
     * Since it's scrolling, it's easier to move the background rather than the objects
     * Movement is a little counter intuitive since pressing the right key lowers the X, while the left key rises it          
     */
    private void move(){
        if (Greenfoot.isKeyDown("left") && canMoveLeft()) {
            setLocation(getX() + OFFSET, getY());
        }
        if (Greenfoot.isKeyDown("right") && canMoveRight()) {
            setLocation(getX() - OFFSET, getY());
        }
    }

    private boolean canMoveLeft(){
        return getX() + OFFSET >= 0 && getX() + OFFSET <= 600;
    }

    private boolean canMoveRight(){
        return getX() - OFFSET >= 0 && getX() - OFFSET <= 600;
    }
}
