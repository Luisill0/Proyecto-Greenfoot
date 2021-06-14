import greenfoot.*;

public class NonScrollingDoor extends Door
{
    public NonScrollingDoor(String imageName,SupportedScene sceneToGo){
        super(imageName,sceneToGo);
    }
    
    public void act(){
        if(canChange()){
            changeScene();
        }
    }
}
