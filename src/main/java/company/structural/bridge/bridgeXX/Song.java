package company.structural.bridge.bridgeXX;

public class Song {
    private String name ;
    private String song ;

    public Song(String name, String song) {

        this.name = name;

        this.song = song;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return song;
    }

    public void setSound(String sound) {
        this.song = sound;
    }

    @Override
    public String toString() {
        return name;
    }
}
