import greenfoot.*;

public class Alien extends Character implements NonPlayableCharacter
{
    Alien(double crit,double dmg,double protections,double dodge){
        super(crit,dmg,protections,dodge);
        setImage("Alien - Pose - Idle.png");
    }
    
    public void receiveAttack(double dmg,double probToHit){}
    
    public void takeAction(){
        
    }
    
    public void reproduceCombatAnimation(String combatImg,String combatSound){
    }
    
    public void ability1(){
        
    }
    
    public void setCombatStatus(boolean isInBattle){
        this.isInBattle = isInBattle;
    }
    
    public void ability2(){
        
    }
}
