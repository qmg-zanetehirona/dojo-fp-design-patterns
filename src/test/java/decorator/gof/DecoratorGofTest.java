package decorator.gof;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorGofTest {

    @Test
    @DisplayName("Decorator using Gof Test")
    void DecoratorTest()  {
        //When
        double calculate = DecoratorGof.calculate(300000);
        //Then
        assertEquals(18800.0d, calculate);
    }
}