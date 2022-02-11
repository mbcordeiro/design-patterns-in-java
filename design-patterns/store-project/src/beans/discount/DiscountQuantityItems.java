package beans.discount;

import beans.budget.Budget;

import java.math.BigDecimal;

public class DiscountQuantityItems  extends Discount{

    public DiscountQuantityItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getQuantityItems() > 5)
            return budget.getValue().multiply(new BigDecimal("0.1"));

        return nextDiscount.calculate(budget);
    }
}
