package chain.carwash.gof;

import chain.WashState;
import chain.Car;

public class PolishStep extends CarWashStep {

    @Override
    public Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.POLISHED);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}