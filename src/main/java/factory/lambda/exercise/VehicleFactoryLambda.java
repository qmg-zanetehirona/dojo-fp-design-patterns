package factory.lambda.exercise;

import factory.VehicleColor;
import factory.gof.*;

public class VehicleFactoryLambda {

    public static Vehicle vehicleOfType(VehicleTypeLambda type,
                                        VehicleColor color) {
        return new Bus(VehicleColor.RED); // todo: remove and implement logic
    }
}
