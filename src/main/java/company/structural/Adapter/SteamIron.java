package company.structural.Adapter;

public class SteamIron  implements IHomeAppliances{
    private int volt;

    public SteamIron() {
        this.volt = volt;
    }

    @Override
    public int PlugAndRun() {
        System.out.print(" the irone is running ");
        return volt;
    }
}
