import greenfoot.*;

public class LevelFactory
{
    public static World startLevel(SupportedLevel levelToStart){
        Corridor.corridorsPassed = 0;
        Chamber.chambersPassed = 0;
        switch(levelToStart){
            case LEVEL1:
                return new ChamberLevel1();
            case LEVEL2:
                return new ChamberLevel2();
            default:
                return null;
        }
    }
}
