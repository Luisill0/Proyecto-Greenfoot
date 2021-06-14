public class SceneFactory  
{
    public static Scene getScene(SupportedScene supportedScene){
        switch(supportedScene){
            case CORRIDORLEVEL1:
                return(new CorridorLevel1());
            case CHAMBERLEVEL1:
                return(new ChamberLevel1());
            default:
                return null;
        }
    }
}
