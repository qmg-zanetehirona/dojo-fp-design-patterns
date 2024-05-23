package chain.lambda;

import chain.carwash.Car;
import chain.carwash.WashState;
import chain.carwash.newway.NewWayCarWashExercise;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chain.carwash.WashState.DRIED;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewWayCarWashExerciseTest {

    @Test
    @DisplayName("Test Car Wash New Way 1")
    void testCarWashOldWay1() {
        //Given
        Car car = new Car();
        NewWayCarWashExercise newWayCarWashExercise = new NewWayCarWashExercise();
        //When
        WashState carWashFinalState = newWayCarWashExercise.getCarWashFinalState(car);
        //Then
        assertEquals(DRIED, carWashFinalState);
    }
}
