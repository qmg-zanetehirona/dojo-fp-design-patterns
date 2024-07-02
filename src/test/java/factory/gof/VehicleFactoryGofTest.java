package factory.gof;

import org.junit.jupiter.api.Test;

import static factory.VehicleColor.*;
import static factory.gof.VehicleType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleFactoryGofTest {

    @Test
    void createVehicle() {
        Vehicle car = VehicleFactoryGof.vehicleOfType(CAR, RED);
        assertEquals("Check if the car is properly locked", car.start());
        assertEquals(RED, car.color());
        Vehicle truck = VehicleFactoryGof.vehicleOfType(TRUCK, BLUE);
        assertEquals("Check if the truck is properly loaded", truck.start());
        assertEquals(BLUE, truck.color());
        Vehicle bus = VehicleFactoryGof.vehicleOfType(BUS, BLACK);
        assertEquals("Check if everyone in the bus is seated", bus.start());
        assertEquals(BLACK, bus.color());
    }
}