package factory.gof;

import factory.VehicleColor;

public class Bus implements Vehicle {
    private final VehicleColor color;

    public Bus(VehicleColor color) {
        this.color = color;
    }

    @Override
    public String start() {
        return "Check if everyone in the bus is seated";
    }

    @Override
    public VehicleColor color() {
        return this.color;
    }
}
