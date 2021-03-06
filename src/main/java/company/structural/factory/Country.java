package company.structural.factory;

public interface Country {

    public String getArea();

    public String getCapital();

    default String getClassAsString() {
        return this.getClass().getSimpleName() + " [Area=" + getArea() + ", Capital=" + getCapital() + "]";
    }
}
