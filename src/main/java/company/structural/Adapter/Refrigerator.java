package company.structural.Adapter;

public class Refrigerator implements IHomeAppliances{
    private int volt;

    public Refrigerator() {
        this.volt = 200;
    }


    @Override
    public int PlugAndRun() {
        System.out.print(" the Refrigerator is running ");
        return volt;
    }
}
