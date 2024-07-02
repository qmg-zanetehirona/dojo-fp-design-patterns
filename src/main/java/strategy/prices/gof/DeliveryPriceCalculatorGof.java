package strategy.prices.gof;

import strategy.prices.Item;

import java.math.BigDecimal;

public class DeliveryPriceCalculatorGof {

    public BigDecimal calculateDeliveryPrice(Item item, DeliveryPriceCalculator deliveryPriceCalculator) {
        return deliveryPriceCalculator.priceFor(item);
    }
}