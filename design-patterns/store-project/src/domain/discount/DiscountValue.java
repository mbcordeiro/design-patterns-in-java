package domain.discount;

import domain.budget.Budget;

import java.math.BigDecimal;

public class DiscountValue extends Discount{

    public DiscountValue(Discount nextDiscount) {
        super(nextDiscount);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
