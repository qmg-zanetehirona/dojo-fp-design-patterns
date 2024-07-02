package chain.carwash.gof;

import chain.WashState;
import chain.Car;

public class ChangeOfResCarWashGof {

    public WashState getCarWashFinalState(Car car) {

        final CarWashStep chain = new InitialWashStep();

        chain.andThen(new SoapStep())
                .andThen(new RinseStep())
                .andThen(new PolishStep())
                .andThen(new DryStep());

        return chain.applyTo(car).washState();
    }
}
