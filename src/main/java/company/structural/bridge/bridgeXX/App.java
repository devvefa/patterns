package company.structural.bridge.bridgeXX;

public class App {

    /*
    * the wrong way
    *
    */


    public static void main(String[] args) {
        Song muzik = new Song("Yalnız Kurt ahmet şafak" ,"Biz böyle görmedik, haramı bilmedik  ");
        Computer computer =new Computer();
        computer.playSong(muzik);

    }
}
