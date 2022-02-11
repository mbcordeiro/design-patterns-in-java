package beans.discount;

import beans.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount nextDiscount;

    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public abstract BigDecimal calculate(Budget budget);
}
