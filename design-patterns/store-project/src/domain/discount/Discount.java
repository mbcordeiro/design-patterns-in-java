package domain.discount;

import domain.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount nextDiscount;

    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public BigDecimal calculate(Budget budget) {
        if (shouldApply(budget)) return performCalculation(budget);

        return nextDiscount.calculate(budget);
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    protected abstract boolean shouldApply(Budget budget);
}
