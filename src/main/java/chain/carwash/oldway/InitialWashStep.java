package chain.carwash.oldway;

import chain.carwash.Car;
import chain.carwash.WashState;

public class InitialWashStep extends CarWashStep {

    @Override
    public Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.INITIAL_WASH);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}