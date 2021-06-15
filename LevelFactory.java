import greenfoot.*;

public class LevelFactory
{
    public static World startLevel(SupportedLevel levelToStart){
        Corridor.corridorsPassed = 0;
        Chamber.chambersPassed = 0;
        switch(levelToStart){
            case LEVEL1:
                return new ChamberLevel1();
            default:
                return null;
        }
    }
}
