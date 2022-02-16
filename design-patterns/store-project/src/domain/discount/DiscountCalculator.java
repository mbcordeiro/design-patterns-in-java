package domain.discount;

import domain.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        var discount = new DiscountQuantityItems(new DiscountValue(new NoDiscount()));

        return discount.calculate(budget);
    }
}
