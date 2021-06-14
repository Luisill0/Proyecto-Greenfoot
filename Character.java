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
    
    public abstract void reproduceCombatAnimation();
    public abstract void ability1();
    public abstract void ability2();
    public abstract void ability3();
    public abstract void ability4();
    
    
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
