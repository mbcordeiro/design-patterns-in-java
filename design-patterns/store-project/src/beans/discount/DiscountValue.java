package beans.discount;

import beans.budget.Budget;

import java.math.BigDecimal;

public class DiscountValue extends Discount{

    public DiscountValue(Discount nextDiscount) {
        super(nextDiscount);
    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0)
            return budget.getValue().multiply(new BigDecimal("0.1"));

        return nextDiscount.calculate(budget);
    }
}
