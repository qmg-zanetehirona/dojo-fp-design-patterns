package strategy.prices.oldway;

import strategy.prices.Item;

import java.math.BigDecimal;

public class DeliveryPriceCalculatorOldWay {

    public BigDecimal calculateDeliveryPrice(Item item, DeliveryPriceCalculator deliveryPriceCalculator) {
        return deliveryPriceCalculator.priceFor(item);
    }
}