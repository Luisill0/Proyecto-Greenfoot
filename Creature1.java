/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature1 extends Character implements NonPlayableCharacter
{
    // instance variables - replace the example below with your own
    private int dropItemRate;

    Creature1(double crit,double dmg,double protections,double dodge){
        super(crit,dmg,protections,dodge);
        dropItemRate = 15;
        setImage("Example2.jpg");
    }

    public void makeAction(){
        
    }
    
    public void dropItem(){
        
    }
    
    public void reproduceCombatAnimation(){
        
    }
    
    public void ability1(){
        
    }
    
    public void ability2(){
        
    }
    
    public void ability3(){
        
    }
    
    public void ability4(){
        
    }
}
