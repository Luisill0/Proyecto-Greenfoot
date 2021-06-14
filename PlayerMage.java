import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PlayerMage extends Character implements PlayableCharacter
{
    private int sanityPoints;
    private static final int OFFSET_FORWARD = 3;
    private static final int OFFSET_BACKWARD = 2;
    private int poseStatus = 0;
    String[] abilityNameList = new String[4];
    
    public PlayerMage(double crit,double dmg,double protections,double dodge){
        super(crit,dmg,protections,dodge);
        sanityPoints = 200;
        setImage("Mage - Pose - Idle.png");
        
    }
    

    public String[] getAbilityNameList(){
        return abilityNameList;
    }
    
    public void takeAction(){
        
    }
    
    public void handleDirection(){
        int x = getX();

        if(Greenfoot.isKeyDown("right")){
            setLocation(x + OFFSET_FORWARD, 155);
            poseStatus = 1;
        }else if(Greenfoot.isKeyDown("left")){
            setLocation(x - OFFSET_BACKWARD, 155);
            poseStatus = 1;
        }else{
            poseStatus = 0;
        }
    }
    
    public void handleDirectionAnimation(){
        int x = getX();
        
        if(poseStatus == 1){
            setImage("Mage - Pose - Walk.png");
        }else if(poseStatus == 0){
            setImage("Mage - Pose - Idle.png");
            setLocation(x , 170);
        }
    }
    
    public void reproduceCombatAnimation(){
    }
    
    public void ability1(){
        
    }
    
    public void ability2(){
        
    }
    
    public void ability3(){
        
    }
    
    public void ability4(){
        
    }
    
    public void act() 
    {
        // Add your action code here.
        handleDirection();
        handleDirectionAnimation();
    }    
}
