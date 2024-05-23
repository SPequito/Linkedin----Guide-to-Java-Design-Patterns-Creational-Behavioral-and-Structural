package StatePattern;

public class MeidaPlayerStart implements MediaPlayerState {

  @Override
  public void pressButtonMedia(MediaPlayer mediaPlayer){
    mediaPlayer.pause();
    mediaPlayer.setState(new MediaPlayerStop());
    System.out.println("media player is playing");
  }


  
}