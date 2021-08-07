package company.structural.bridge.bridge.sounddevice;

public class headphone  implements  ISpeakerDevice{


    @Override
    public void playIncomingVoice(String song) {
        System.out.println(" headphone play a song");

    }
}
