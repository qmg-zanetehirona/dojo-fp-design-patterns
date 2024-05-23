package strategy.prices.oldway;

import strategy.prices.Item;

import java.math.BigDecimal;

public interface DeliveryPriceCalculator {
    BigDecimal priceFor(Item item);
}
