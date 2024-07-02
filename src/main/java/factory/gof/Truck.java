package factory.gof;

import factory.VehicleColor;

public class Truck implements Vehicle {
    private final VehicleColor color;

    public Truck(VehicleColor color) {
        this.color = color;
    }

    @Override
    public String start() {
        return "Check if the truck is properly loaded";
    }

    @Override
    public VehicleColor color() {
        return this.color;
    }
}
