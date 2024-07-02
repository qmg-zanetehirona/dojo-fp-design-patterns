package factory.gof;

import factory.VehicleColor;

public class Car implements Vehicle {
    private final VehicleColor color;

    public Car(VehicleColor color) {
        this.color = color;
    }

    @Override
    public String start() {
        return "Check if the car is properly locked";
    }

    @Override
    public VehicleColor color() {
        return this.color;
    }
}
