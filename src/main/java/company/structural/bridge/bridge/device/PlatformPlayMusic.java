package company.structural.bridge.bridge.device;


import company.structural.bridge.bridge.Song;
import company.structural.bridge.bridge.musicplayer.IMusicPlayer;
import company.structural.bridge.bridge.sounddevice.ISpeakerDevice;

public abstract class PlatformPlayMusic {

    protected ISpeakerDevice computerSpeaker;
    protected IMusicPlayer computerMusicPlayer;

    public PlatformPlayMusic() {
    }

    public PlatformPlayMusic(ISpeakerDevice computerSpeaker, IMusicPlayer computerMusicPlayer) {
        this.computerSpeaker = computerSpeaker;
        this.computerMusicPlayer = computerMusicPlayer;
    }
    void  playSong(Song song){
        String ses = computerMusicPlayer.playSong(song);
        computerSpeaker.playIncomingVoice(ses);

    }

}
