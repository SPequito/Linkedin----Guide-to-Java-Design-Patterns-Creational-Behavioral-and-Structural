package ProxyPattern;

public class MovieMediaProxy implements MediaPlayer {

  private MovieMediaPlayer moviemMediaPlayer;
  
  @Override
   public void playMedia() {
        if (moviemMediaPlayer == null){
          moviemMediaPlayer = new MovieMediaPlayer(); 
        }
        moviemMediaPlayer.playMedia();
   }
}