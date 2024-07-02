package chain.lambda;

import chain.Car;
import chain.WashState;
import chain.carwash.lambda.ChainOfResCarWashFunctional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chain.WashState.DRIED;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResCarWashFunctionalTest {

    @Test
    @DisplayName("Test Car Wash Functional")
    void testCarWashFunctional() {
        //Given
        Car car = new Car();
        ChainOfResCarWashFunctional chainOfResCarWashFunctional = new ChainOfResCarWashFunctional();
        //When
        WashState carWashFinalState = chainOfResCarWashFunctional.getCarWashFinalState(car);
        //Then
        assertEquals(DRIED, carWashFinalState);
    }
}
