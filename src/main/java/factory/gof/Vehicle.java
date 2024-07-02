package factory.gof;

import factory.VehicleColor;

public interface Vehicle {
    default String start() {
        return "Starting the vehicle";
    }

    VehicleColor color();
}
