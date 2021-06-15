import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Character extends Actor
{ 
    protected double baseCritChance;
    protected double baseDmg;
    protected double baseProtections;
    protected double baseDodge; 
    protected boolean isInBattle;
    protected boolean canTakeAction;
    protected CombatHandler combatHandler;

    public Character (double crit,double dmg,double protections,double dodge){
        this.baseCritChance = crit;
        this.baseDmg = dmg;
        this.baseProtections = protections;
        this.baseDodge = dodge;
    }
    
    public Character(){}
    
    protected void removeDisplays(){}
    
    public void setActionCapability(boolean canTakeAction){
        this.canTakeAction = canTakeAction;
    }
    
    public boolean getActionCapability(){
        return this.canTakeAction;
    }        
    
    public boolean getCombatStatus(){
        return isInBattle;
    }
    
    public abstract void setCombatStatus(boolean isInBattle);
    
    protected abstract void receiveAttack(double dmg,double probToHit);
    
    public abstract void reproduceCombatAnimation(String combatImg,String combatSound);

    public  void ability1(){}

    public  void ability2(){}

    public void act() 
    {
        // Add your action code here.
    }    
}
