import greenfoot.*;

public class ChamberLevel1 extends Chamber
{
    private static final int numberOfChambers = 3;
    private CombatHandler combatHandler = new CombatHandler();  
    private PlayerMage playerMage;
    
    public ChamberLevel1()
    {                
        try{
            generatePlayer();
            generateChamber();            
        }catch(CombatChamberException c){
            NonScrollingBackground background = new NonScrollingBackground("bglv1chamberempty.jpg");
            this.addObject(background,300,132);
            generateBattleChamber();
        }finally{
            this.addObject(new NonScrollingDoor("door1.png",SupportedScene.CORRIDORLEVEL1),520,112);
            this.setPaintOrder(HealthDisplayer.class,PlayerMage.class,TargetIcon.class,Enemy.class,Door.class);        
        }                   
    }
    
    private void generateBattleChamber(){
        playerMage = playerMage.setCombatHandler(combatHandler);
        generateEnemies();
        AbilityDisplayer.resetCurrentAbility();   
    }
    
    void generatePlayer(){
        playerMage = new PlayerMage().setStats(0.5,5.0,3.0,6.0).setDefaultLocation(35,170);        
        addObject(playerMage,35,170);
        playerMage.addDisplays();
    }
    
    void generateEnemies(){
        Enemy spider;
        
        switch(Chamber.chambersPassed){
            case 2:
                spider = new Spider().setStats(2.0,8.0,0.5,5.0).setCombatHandler(combatHandler);
                addObject(spider,300,170);
                spider.addDisplays();
                break;
            case 3:
                spider = new Spider().setStats(2.0,8.0,0.5,5.0).setCombatHandler(combatHandler);
                addObject(spider,300,170);
                spider.addDisplays();
                spider = new Spider().setStats(2.0,8.0,0.5,5.0).setCombatHandler(combatHandler);
                addObject(spider,450,170);
                spider.addDisplays();
                break;
        }      
    }    
    
    private void generateChamber() throws CombatChamberException{
        if(Chamber.chambersPassed == 2 || Chamber.chambersPassed == 3){
            throw new CombatChamberException();
        }        
        NonScrollingBackground background = new NonScrollingBackground("bglv1chamber.jpg"); 
        this.addObject(background,300,132);
    }   
    
    public void stopped(){
        MusicPlayer.pauseMusic();
    }
}
