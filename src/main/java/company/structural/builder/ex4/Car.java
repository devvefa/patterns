package company.structural.builder.ex4;

import java.awt.*;

public class Car {
    private Color carColor ;
    private String carName ;

    private int hp  ;

    public Car(CarBuilder carBuilder) {
        this.carColor = carBuilder.getCarColor();
        this.carName = carBuilder.getCarName();
        this.hp = carBuilder.getHp();
    }

    public Color getCarColor() {
        return carColor;
    }

    public String getCarName() {
        return carName;
    }

    public int getHp() {
        return hp;
    }

}