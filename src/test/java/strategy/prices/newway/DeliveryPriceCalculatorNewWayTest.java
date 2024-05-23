package strategy.prices.newway;

import org.junit.jupiter.api.Test;
import strategy.prices.Item;
import strategy.prices.Plan;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryPriceCalculatorNewWayTest {

    DeliveryPriceCalculatorNewWay deliveryPriceCalculatorNewWay = new DeliveryPriceCalculatorNewWay();

    @Test
    void calculateDeliveryPrice() {
        Item item = new Item(1L, new BigDecimal("12.99"));
        assertEquals(new BigDecimal("1.32475"), deliveryPriceCalculatorNewWay.calculateDeliveryPrice(item, Plan.BASIC));
        assertEquals(new BigDecimal("1.19485"), deliveryPriceCalculatorNewWay.calculateDeliveryPrice(item, Plan.PREMIUM));
        assertEquals(new BigDecimal("1.000"), deliveryPriceCalculatorNewWay.calculateDeliveryPrice(item, Plan.BUSINESS));
    }

    @Test
    void calculateDeliveryPrice2() {
        Item item = new Item(1L, new BigDecimal("1000"));
        assertEquals(new BigDecimal("26.000"), deliveryPriceCalculatorNewWay.calculateDeliveryPrice(item, Plan.BASIC));
        assertEquals(new BigDecimal("16.000"), deliveryPriceCalculatorNewWay.calculateDeliveryPrice(item, Plan.PREMIUM));
        assertEquals(new BigDecimal("1.0"), deliveryPriceCalculatorNewWay.calculateDeliveryPrice(item, Plan.BUSINESS));
    }
}