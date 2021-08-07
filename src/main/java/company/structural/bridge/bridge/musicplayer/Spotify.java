package company.structural.bridge.bridge.musicplayer;


import company.structural.bridge.bridge.Song;

public class Spotify implements  IMusicPlayer{
    @Override
    public String playSong(Song song) {

        System.out.println( song+ " song is playing in  Spotify ");
        return song.getName();
    }
}
