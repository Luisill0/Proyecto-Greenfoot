import greenfoot.*;

public abstract class Enemy extends Character
{
    protected double maxHitPoints;
    protected double hitPoints;
    protected EnemyHealthDisplayer healthDisplayer;
    protected TargetIcon icon;
    protected boolean targeteable;
    
    public Enemy(double crit,double dmg,double protections,double dodge){
        this.baseCritChance = crit;
        this.baseDmg = dmg;
        this.baseProtections = protections;
        this.baseDodge = dodge;
    }
    
    public Enemy(){}
    
    protected void receiveAttack(double dmg,double probToHit){
        boolean hit = Greenfoot.getRandomNumber(100) < probToHit;
        
        if(hit){
            double dmgToTake = dmg - baseProtections;
            if(dmgToTake <= 0){
                dmgToTake = 1;
            }
            this.hitPoints -= dmgToTake;
        }    
        healthDisplayer.update();
        if(hitPoints <= 0){
            deathSequence();
        }
    }            
    
    protected abstract void takeAction();
    
    protected abstract void deathSequence();
    
    public abstract void addDisplays();
    
    public double getHitPoints(){
        return this.hitPoints;
    }
    
    public double getMaxHealth(){
        return this.maxHitPoints;
    }
    
    public void setIconVisibility(boolean visible){
        this.icon.setVisibility(visible);
    }
    
    public void reproduceCombatAnimation(String combatImg,String combatSound){}
}
