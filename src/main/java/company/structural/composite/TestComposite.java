package company.structural.composite;

public class TestComposite {

    public static void main(String[] args) {
        Song song1=new Song("yok yok ","feride");
        Song song2=new Song("shap of you","Ed Shreen");
        Song song3=new Song("Sensiz Ben  olyım ","yalın");
        Song song4=new Song("ki kisen","yalın");

        PlayList list1=new PlayList();
        list1.addSongs(song1);
        list1.addSongs(song2);
        list1.addSongs(song3);
        list1.addSongs(song4);
        list1.play();
        list1.nextSong();
        list1.previousSong();
        list1.nextSong();

    }
}
