package strategy.prices.lambda;

import org.junit.jupiter.api.Test;
import strategy.prices.Item;
import strategy.prices.lambda.exercise.Plan;
import strategy.prices.lambda.exercise.DeliveryPriceCalculatorLambdaExercise;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryPriceCalculatorLambdaTest {

    DeliveryPriceCalculatorLambdaExercise deliveryPriceCalculatorLambdaExercise = new DeliveryPriceCalculatorLambdaExercise();

    @Test
    void calculateDeliveryPrice() {
        Item item = new Item(1L, new BigDecimal("12.99"));
        assertEquals(new BigDecimal("1.32475"), deliveryPriceCalculatorLambdaExercise.calculateDeliveryPrice(item, Plan.BASIC));
        assertEquals(new BigDecimal("1.19485"), deliveryPriceCalculatorLambdaExercise.calculateDeliveryPrice(item, Plan.PREMIUM));
        assertEquals(new BigDecimal("1.000"), deliveryPriceCalculatorLambdaExercise.calculateDeliveryPrice(item, Plan.BUSINESS));
    }
}