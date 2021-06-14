import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayerMage extends Character implements PlayableCharacter
{    
    private PlayerHealthDisplayer sanityDisplayer;
    private ClassTester arena;
    private int sanityPoints;
    private static final int OFFSET_FORWARD = 3;
    private static final int OFFSET_BACKWARD = 2;
    private int poseStatus = 0;
    String[] abilityNameList = new String[4];            

    public PlayerMage(){
        this.sanityPoints = 200;
        resetImage();
    }

    public PlayerMage setStats(double crit,double dmg,double protections,double dodge){
        this.baseCritChance = crit;
        this.baseDmg = dmg;
        this.baseProtections = protections;
        this.baseDodge = dodge;        
        return this;
    }

    public PlayerMage setArena(ClassTester arena){
        this.arena = arena;
        return this;
    }

    public PlayerMage setCombatHandler(CombatHandler combatHandler){
        this.combatHandler = combatHandler;
        combatHandler.setMainCharacter(this);
        return this;
    }
    
    public void addDisplays(){
        this.sanityDisplayer = new PlayerHealthDisplayer(this);
        sanityDisplayer.update();
        getWorld().addObject(sanityDisplayer,35,230);        
        getWorld().addObject(new AbilityDisplayer(this),125,268);
    }
    
    protected void removeDisplays(){
        getWorld().removeObject(sanityDisplayer);
    }
    
    public String[] getAbilityNameList(){
        return abilityNameList;
    }

    public void takeAction(){
        switch(AbilityDisplayer.getCurrentAbility()){
            case 1:
                ability1();
                break;
            case 2:
                ability2();
                break;
            case 3:
                ability3();
                break;
            case 4:
                ability4();
                break;
        }
        AbilityDisplayer.resetCurrentAbility();
        combatHandler.playerTurnOver();
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

    public void reproduceCombatAnimation(String combatImg,String combatSound){
        this.setImage(combatImg);
        Greenfoot.playSound(combatSound);
        Greenfoot.delay(50);
        resetImage();
    }

    public void reproduceCombatAnimation(String combatImg,String combatSound,int OFFSET){
        this.setImage(combatImg);
        this.setLocation(getX() + OFFSET,getY());
        Greenfoot.playSound(combatSound);
        Greenfoot.delay(50);
        this.setLocation(getX() - OFFSET,getY());
        resetImage();
    } 
    
    public void ability1(){
        double dmgToDeal = (baseDmg*0.8) + (Greenfoot.getRandomNumber(100) < baseCritChance ? baseDmg:0);
        double probToHit = 95.0;
        combatHandler.getEnemy().receiveAttack(dmgToDeal,probToHit);
        reproduceCombatAnimation("Mage - Ability - Cut.png","slash.mp3");
    }

    public void ability2(){
        double dmgToDeal = (baseDmg*1.10) + (Greenfoot.getRandomNumber(100) < baseCritChance ? baseDmg:0);
        double probToHit = 75.0;
        combatHandler.getEnemy().receiveAttack(dmgToDeal,probToHit);
        reproduceCombatAnimation("Mage - Ability - CastSpell.png","spell.mp3",25);
    }

    public void ability3(){
        this.baseDmg += 2;
    }

    public void ability4(){
        this.baseProtections += 5;
    }

    public void act() 
    {
        if(canMove()){
            handleDirection();
            handleDirectionAnimation();
        }
        if(canTakeAction){
            if(AbilityDisplayer.getCurrentAbility() != 0){            
                combatHandler.highlightEnemies();
                if(combatHandler.clickedOnEnemy()){
                    takeAction();
                }
            }else{
                combatHandler.stopHighlight();
            }                
        }
    }  
    
    protected void receiveAttack(double dmg,double probToHit){
        boolean hit = Greenfoot.getRandomNumber(100) < probToHit;
        
        if(hit){
            double dmgToTake = dmg - baseProtections;
            if(dmgToTake <= 0){
                dmgToTake = 1;
            }
            this.sanityPoints -= dmgToTake;
        }    
        sanityDisplayer.update();
        if(sanityPoints <= 0){
            combatHandler.gameOverSequence();
        }
    } 
    
    private void resetImage(){
        setImage("Mage - Pose - Idle.png");
    }
    
    private boolean canMove(){
        return !isInBattle;
    }        
    
    public void setCombatStatus(boolean isInBattle){
        this.isInBattle = isInBattle;
    }
    
    public int getSanityPoints(){
        return this.sanityPoints;
    }    
}
