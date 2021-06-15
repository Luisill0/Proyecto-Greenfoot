import greenfoot.*;

public class Spider extends Enemy implements NonPlayableCharacter
{    
    public Spider(){
        setImage("Spider - Pose - Idle.png");
        this.maxHitPoints = 20;
        this.hitPoints = 20;
    }    

    public Spider setCombatHandler(CombatHandler combatHandler){
        this.combatHandler = combatHandler;
        combatHandler.addEnemy(this);
        return this;
    }
    
    public Spider setStats(double crit,double dmg,double protections,double dodge){
        this.baseCritChance = crit;
        this.baseDmg = dmg;
        this.baseProtections = protections;
        this.baseDodge = dodge;        
        return this;
    }
    
    public void addDisplays(){
        this.healthDisplayer = new EnemyHealthDisplayer(this);
        healthDisplayer.update();
        getWorld().addObject(healthDisplayer,getX(),getY() + 50);
        this.icon = new TargetIcon(this);
        getWorld().addObject(icon,getX(),170);
    }
    
    protected void deathSequence(){
        getWorld().removeObject(healthDisplayer);
        getWorld().removeObject(icon);
        getWorld().removeObject(this);
    }
    
    public void takeAction(){
        if(hitPoints >= 0){        
            if(Greenfoot.getRandomNumber(100) % 2 == 0){
                ability1();
            }else{
                ability2();
            }
        }
    }    
    
    public void reproduceCombatAnimation(String combatImg,String combatSound){
        this.setImage(combatImg);
        Greenfoot.playSound(combatSound);
        Greenfoot.delay(50);
        resetImage();
    }
    
    private void resetImage(){
        this.setImage("Spider - Pose - Idle.png");
    }
    
    public void setCombatStatus(boolean isInBattle){
        this.isInBattle = isInBattle;
    }
    
    public void ability1(){
        double dmgToDeal = (baseDmg*0.8) + (Greenfoot.getRandomNumber(100) < baseCritChance ? baseDmg:0);
        double probToHit = 80.0;
        combatHandler.getMainCharacter().receiveAttack(dmgToDeal,probToHit);
        reproduceCombatAnimation("Spider - Ability - Empale.png","spiderimpale.mp3");
    }
    
    public void ability2(){
        double dmgToDeal = (baseDmg*1.10) + (Greenfoot.getRandomNumber(100) < baseCritChance+25 ? baseDmg*1.10:0);
        double probToHit = 80.0;
        combatHandler.getMainCharacter().receiveAttack(dmgToDeal,probToHit);
        reproduceCombatAnimation("Spider - Ability - Slice.png","spiderslash.mp3");
    }        
}
