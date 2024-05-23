package chain.carwash.oldway;

import chain.carwash.Car;

public abstract class CarWashStep {
    protected CarWashStep nextStep;

    public CarWashStep andThen(CarWashStep nextStep) {
        this.nextStep = nextStep;
        return nextStep;
    }
    public abstract Car applyTo(Car car);
}
