package strategy.prices.gof;

import strategy.prices.Item;

import java.math.BigDecimal;

public interface DeliveryPriceCalculator {
    BigDecimal priceFor(Item item);
}
