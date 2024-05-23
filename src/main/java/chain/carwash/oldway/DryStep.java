package chain.carwash.oldway;

import chain.carwash.Car;
import chain.carwash.WashState;

public class DryStep extends CarWashStep {

    @Override
    public Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.DRIED);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
