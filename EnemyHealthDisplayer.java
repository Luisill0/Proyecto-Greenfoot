import greenfoot.*;

public class EnemyHealthDisplayer extends HealthDisplayer
{
    private Enemy enemy;
    
    public EnemyHealthDisplayer(Enemy enemy){
        this.enemy = enemy;
    }
    
    public void update(){
        String hp =(int)enemy.getHitPoints() + "/" + (int)enemy.getMaxHealth();
        this.setImage(new GreenfootImage(hp,20,Color.WHITE,Color.BLACK));
    }
}
