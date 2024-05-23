package decorator.lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorLambdaTest {

    @Test
    @DisplayName("Decorator using Lambda Test")
    void DecoratorTest()  {
        //When
        double calculate = DecoratorLambda.calculate(300000);
        //Then
        assertEquals(18800.0d, calculate);
    }
}
