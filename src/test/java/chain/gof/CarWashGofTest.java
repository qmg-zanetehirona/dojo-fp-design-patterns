package chain.gof;

import chain.Car;
import chain.WashState;
import chain.carwash.gof.ChangeOfResCarWashGof;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarWashGofTest {

    @Test
    @DisplayName("Test Car Wash Gof")
    void testCarWashGof() {
        //Given
        Car car = new Car();
        ChangeOfResCarWashGof changeOfResCarWashGof = new ChangeOfResCarWashGof();
        //When
        WashState carWashFinalState = changeOfResCarWashGof.getCarWashFinalState(car);
        //Then
        assertEquals(WashState.DRIED, carWashFinalState);
    }
}
