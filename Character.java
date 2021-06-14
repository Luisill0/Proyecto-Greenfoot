import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Character extends Actor
{
    private double baseCritChance;
    private double baseDmg;
    private double baseProtections;
    private double baseDodge;
    
    
    public Character (double crit,double dmg,double protections,double dodge){
        this.baseCritChance = crit;
        this.baseDmg = dmg;
        this.baseProtections = protections;
        this.baseDodge = dodge;
    }
    
    public  abstract void reproduceCombatAnimation();
    public  void ability1(){}
    public  void ability2(){}
    
    public void act() 
    {
        // Add your action code here.
    }    
}
