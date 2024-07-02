package factory.gof;

import factory.VehicleColor;

public class VehicleFactoryGof {

    public static Vehicle vehicleOfType(VehicleType type,
                                        VehicleColor color) {
        if (type.equals(VehicleType.CAR)) {
            return new Car(color);
        } else if (type.equals(VehicleType.BUS)) {
            return new Bus(color);
        } else if (type.equals(VehicleType.TRUCK)) {
            return new Truck(color);
        }
        throw new IllegalArgumentException("No support for type " + type);
    }
}
