package company.structural.composite;
//leaf
public class Song implements IMusic {
    private String title, artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
         System.out.println( "right is playing"+title+"that sang has sung by  "+ artist);
    }
}
