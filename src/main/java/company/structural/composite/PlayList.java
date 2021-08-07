package company.structural.composite;

import java.util.ArrayList;


public class PlayList implements IMusic  {


    private final ArrayList<IMusic> childMusics = new ArrayList<>();
    int currentTrack = 0;

   /* String listName;


    public PlayList(List<Song> songs, String listName) {
        this.songs = songs;
        this.listName = listName;
    }
*/

    public boolean addSongs(Song song) {
        childMusics.add(song);
        return true;
    }

     public void nextSong()
    {
        currentTrack++; childMusics.get(currentTrack).play();

    }

    public void previousSong()
    {
        currentTrack--;
        childMusics.get(currentTrack).play();

    }

    @Override
    public void play() {
        childMusics.get(currentTrack).play();

    }
}
