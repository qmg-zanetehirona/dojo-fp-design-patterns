package chain.gof;

import chain.carwash.Car;
import chain.carwash.WashState;
import chain.carwash.oldway.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarWashOldWayTest {

    @Test
    @DisplayName("Test Car Wash Old Way 1")
    void testCarWashOldWay1() {
        //Given
        Car car = new Car();
        OldWayCarWash oldWayCarWash = new OldWayCarWash();
        //When
        WashState carWashFinalState = oldWayCarWash.getCarWashFinalState(car);
        //Then
        assertEquals(WashState.DRIED, carWashFinalState);
    }
}
