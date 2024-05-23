package chain.carwash.oldway;

import chain.carwash.Car;
import chain.carwash.WashState;

public class OldWayCarWash {

    public WashState getCarWashFinalState(Car car) {

        final CarWashStep chain = new InitialWashStep();

        chain.andThen(new SoapStep())
                .andThen(new RinseStep())
                .andThen(new PolishStep())
                .andThen(new DryStep());

        return chain.applyTo(car).washState();
    }
}
