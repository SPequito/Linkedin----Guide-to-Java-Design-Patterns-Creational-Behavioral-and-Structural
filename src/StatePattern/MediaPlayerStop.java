package StatePattern;

public class MediaPlayerStop implements MediaPlayerState {

  @Override
  public void pressButtonMedia(MediaPlayer mediaPlayer) {
    mediaPlayer.play();
    mediaPlayer.setState(new MeidaPlayerStart());
    System.out.println("Media start playing");
  }

  
}