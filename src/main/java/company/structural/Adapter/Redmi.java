package company.structural.Adapter;

public class Redmi implements Phone{

    private int voltageRequire =5;
    public Redmi() { this.voltageRequire =5;    }

    @Override
    public int charging() {
        System.out.print (" Remdi Phone  is charging");

        return voltageRequire;
    }
}
