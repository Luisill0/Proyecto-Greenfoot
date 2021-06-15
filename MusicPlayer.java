import greenfoot.*;

public class MusicPlayer  
{
    static GreenfootSound gameMusic;
    static String currentSong; 
    
    public static void reproduceMusic(String song){
        currentSong = song;
        gameMusic = new GreenfootSound(currentSong);
        gameMusic.playLoop();
    }
    
    public static void pauseMusic(){
        gameMusic.pause();
    }
    
    public static void resumeMusic(){
        if(!gameMusic.isPlaying()){
            gameMusic.playLoop();
        }
    }
    
    public static void stopMusic(){
        if(gameMusic.isPlaying()){
            gameMusic.stop();
        }
    }
}
