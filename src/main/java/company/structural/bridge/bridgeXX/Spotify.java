package company.structural.bridge.bridgeXX;

public class Spotify {
    public  String playSong(Song song){
        System.out.println( song+ " song is playing in  Spotify ");
        return song.getSound();
    }
}
