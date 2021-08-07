package company.structural.Adapter;

public class PhoneAdopter implements  IHomeAppliances{
    private Phone phone;

    public PhoneAdopter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int PlugAndRun() {
        return phone.charging();
    }
}
