package beans.discount;

import beans.budget.Budget;

import java.math.BigDecimal;

public class DiscountQuantityItems  extends Discount{

    public DiscountQuantityItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getQuantityItems() > 5;
    }
}
