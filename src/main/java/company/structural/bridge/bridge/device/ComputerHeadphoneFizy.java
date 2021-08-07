package company.structural.bridge.bridge.device;

import company.structural.bridge.bridge.Song;
import company.structural.bridge.bridge.musicplayer.Fizy;
import company.structural.bridge.bridge.sounddevice.headphone;

public class ComputerHeadphoneFizy extends PlatformPlayMusic{

    public ComputerHeadphoneFizy(){
        computerSpeaker=new headphone();
        computerMusicPlayer=new Fizy();
    }

    @Override
    public void playSong(Song song) {

            System.out.println( " you hear music on Headphone via Fizy ");
        super.playSong(song);
    }
}
