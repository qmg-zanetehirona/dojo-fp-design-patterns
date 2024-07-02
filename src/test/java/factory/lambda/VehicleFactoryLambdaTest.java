package factory.lambda;

import factory.gof.Vehicle;
import factory.VehicleColor;
import factory.lambda.exercise.VehicleFactoryLambda;
import org.junit.jupiter.api.Test;

import static factory.VehicleColor.*;
import static factory.lambda.exercise.VehicleTypeLambda.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleFactoryLambdaTest {

    @Test
    void createVehicle() {
        Vehicle redCar = VehicleFactoryLambda.vehicleOfType(CAR, RED);
        assertEquals("Check if the car is properly locked", redCar.start());
        assertEquals(RED, redCar.color());
        Vehicle blackTruck = VehicleFactoryLambda.vehicleOfType(TRUCK, BLACK);
        assertEquals(BLACK, blackTruck.color());
        assertEquals("Check if the truck is properly loaded", blackTruck.start());
        Vehicle blueBus =   VehicleFactoryLambda.vehicleOfType(BUS, BLUE);
        assertEquals("Check if everyone in the bus is seated", blueBus.start());
        assertEquals(VehicleColor.BLUE, blueBus.color());
    }
}