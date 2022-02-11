package beans.discount;

import beans.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        if (budget.getQuantityItems() > 5)
            return budget.getValue().multiply(new BigDecimal("0.1"));

        if (budget.getValue().compareTo(new BigDecimal("500")) > 0)
            return budget.getValue().multiply(new BigDecimal("0.1"));

        return BigDecimal.ZERO;
    }
}
