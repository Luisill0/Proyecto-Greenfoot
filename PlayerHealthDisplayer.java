import greenfoot.*;

public class PlayerHealthDisplayer extends HealthDisplayer
{
    private PlayerMage player;
    private GreenfootImage info;
    
    public PlayerHealthDisplayer(PlayerMage player){
        this.player = player;
    }
    
    public void update(){
        String hp = player.getSanityPoints() + "/200";
        info = new GreenfootImage(hp,20,Color.WHITE,Color.BLACK);
        
        info.setTransparency(isVisible()? 255:0);
        
        this.setImage(info);
    }
    
    private boolean isVisible(){
        return player.getCombatStatus();
    }
}
