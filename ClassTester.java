import greenfoot.*;

public class ClassTester extends World
{
    PlayerMage playerMage;
    Enemy spider;
    CombatHandler combatHandler = new CombatHandler();    

    public ClassTester()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new NonScrollingBackground("Stage - 0.jpg"),300,131);
        generatePlayer();
        generateEnemies();
        AbilityDisplayer.resetCurrentAbility();        
    }
    
    void generatePlayer(){
        playerMage = new PlayerMage().setStats(0.5,5.0,3.0,6.0).setArena(this).setCombatHandler(combatHandler);        
        addObject(playerMage,35,170);
        playerMage.addDisplays();
    }
    
    void generateEnemies(){
        spider = new Spider().setStats(0.2,10,0.5,5).setCombatHandler(combatHandler);
        addObject(spider,300,170);
        spider.addDisplays();
        
        spider = new Spider().setStats(0.2,10,0.5,5).setCombatHandler(combatHandler);
        addObject(spider,450,170);
        spider.addDisplays();
    }
    
    public void act(){
    }    
}
