import greenfoot.*;

public class PlayerHealthDisplayer extends HealthDisplayer
{
    private PlayerMage player;
    
    public PlayerHealthDisplayer(PlayerMage player){
        this.player = player;
    }
    
    public void update(){
        String hp = player.getSanityPoints() + "/200";
        this.setImage(new GreenfootImage(hp,20,Color.WHITE,Color.BLACK));
    }
}
