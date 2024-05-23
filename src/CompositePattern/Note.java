package CompositePattern;

public class Note implements Play {

    private final char value;

    public Note(char value) {
        this.value = value;
    }

   
    public void play() {
        System.out.println(value);
    }

    @Override
    public void isPlay() {
        System.out.println(value);
    }
   

}
