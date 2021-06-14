import greenfoot.*;

public abstract class Door extends Actor
{
    protected GreenfootImage objImage;
    protected SupportedScene sceneToGo;

    public Door(String imageName,SupportedScene sceneToGo){
        this.objImage = new GreenfootImage(imageName);
        this.setImage(objImage);
        this.sceneToGo = sceneToGo;
    }
    
    protected boolean canChange(){
        return isTouching(ExampleActor.class) && Greenfoot.isKeyDown("up");
    }
    
    protected void changeScene(){        
        Greenfoot.setWorld(SceneFactory.getScene(sceneToGo));
    }
}
