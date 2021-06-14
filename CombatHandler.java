import greenfoot.*;
import java.util.*;

public class CombatHandler
{
    private Character mainCharacter;
    private List<Enemy> enemies = new LinkedList<>();
    private Enemy enemySelected;
    private int turnNumber;
    
    public void setMainCharacter(PlayerMage mainCharacter){
        this.mainCharacter = mainCharacter;
        mainCharacter.setCombatStatus(true);
        mainCharacter.setActionCapability(true);
    }
    
    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }
    
    public boolean clickedOnEnemy(){
        boolean flag = false;
        
        try{
            if(Greenfoot.getMouseInfo().getButton() == 1){
                Actor clickedOn = Greenfoot.getMouseInfo().getActor();
                if(clickedOn instanceof Enemy){
                    enemySelected = (Enemy)clickedOn;
                    flag = true;
                }
                
                if(clickedOn instanceof TargetIcon){
                    TargetIcon tg = (TargetIcon)clickedOn;
                    enemySelected  = tg.getTarget();
                    flag = true;
                }
            }
        }catch(NullPointerException e){}    
        
        return flag;        
    }
    
    public Character getMainCharacter(){
        return this.mainCharacter;
    }
    
    public Enemy getEnemy(){
        if(clickedOnEnemy()){
            return enemySelected;
        }else{
            return null;
        }
    }
    
    public void highlightEnemies(){
        for(Enemy e : enemies){
            e.setIconVisibility(true);
        }
    }
    
    public void stopHighlight(){
        for(Enemy e : enemies){
            e.setIconVisibility(false);
        }
    }
    
    public void playerTurnOver(){
        mainCharacter.setActionCapability(false);
        for(Enemy e : enemies){
            e.takeAction();
        }
        mainCharacter.setActionCapability(true);
        if(allEnemiesDead()){
            victorySequence();
        }
    }
    
    private boolean allEnemiesDead(){
        boolean flag = true;        
        for(Enemy e : enemies){
            flag = e.getHitPoints() <= 0;
        }        
        return flag;
    }
    
    public void victorySequence(){
        mainCharacter.setCombatStatus(false);
        mainCharacter.removeDisplays();
    }
    
    public void gameOverSequence(){
        Greenfoot.setWorld(new GameOver());
    }
}
