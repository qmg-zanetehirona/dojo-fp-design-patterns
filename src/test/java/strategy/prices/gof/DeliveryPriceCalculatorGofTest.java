package strategy.prices.gof;

import org.junit.jupiter.api.Test;
import strategy.prices.Item;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryPriceCalculatorGofTest {

    DeliveryPriceCalculatorGof deliveryPriceCalculatorGof = new DeliveryPriceCalculatorGof();

    @Test
    void calculateDeliveryPrice() {

        Item item = new Item(1, new BigDecimal("12.99"));
        assertEquals(new BigDecimal("1.32475"), deliveryPriceCalculatorGof.calculateDeliveryPrice(item, new BasicDeliveryPriceCalculator()));
        assertEquals(new BigDecimal("1.19485"), deliveryPriceCalculatorGof.calculateDeliveryPrice(item, new PremiumDeliveryPriceCalculator()));
        assertEquals(new BigDecimal("1.0"), deliveryPriceCalculatorGof.calculateDeliveryPrice(item, new BusinessDeliveryPriceCalculator()));
    }

    @Test
    void calculateDeliveryPrice2() {
        Item item = new Item(1L, new BigDecimal("1000"));
        assertEquals(new BigDecimal("26.000"), deliveryPriceCalculatorGof.calculateDeliveryPrice(item, new BasicDeliveryPriceCalculator()));
        assertEquals(new BigDecimal("16.000"), deliveryPriceCalculatorGof.calculateDeliveryPrice(item, new PremiumDeliveryPriceCalculator()));
        assertEquals(new BigDecimal("1.0"), deliveryPriceCalculatorGof.calculateDeliveryPrice(item, new BusinessDeliveryPriceCalculator()));
    }

}