package company.structural.bridge.bridgeXX;

public class Computer {
    private  Spotify spotify;
    private Speaker speaker;

    public Computer() {
        speaker=new Speaker();
        spotify=new Spotify();
    }
    public  void  playSong(Song song){
     String ses=   spotify.playSong(song);
        speaker.playSound(ses);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
