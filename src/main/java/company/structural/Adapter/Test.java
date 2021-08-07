package company.structural.Adapter;

public class Test {

    public static  void main(String[]ff){


        Socket socket=new Socket();


        SteamIron iron= new SteamIron();
        Refrigerator refrigerator =new Refrigerator();
        socket.SupplyElectricity(iron);
        socket.SupplyElectricity(refrigerator);
        // it is not run   socket.SupplyElectricity(redmi);


        Redmi redmi =new Redmi();
        PhoneAdopter adopter =new PhoneAdopter(redmi);
        socket.SupplyElectricity(adopter);



    }




}
