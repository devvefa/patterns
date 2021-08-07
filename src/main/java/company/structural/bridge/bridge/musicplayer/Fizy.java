package company.structural.bridge.bridge.musicplayer;

import company.structural.bridge.bridge.Song;

public class Fizy implements  IMusicPlayer{
    @Override
    public String playSong(Song song) {
        System.out.println( song+ " song is playing in  Fizy ");
        return song.getName();
    }
}
