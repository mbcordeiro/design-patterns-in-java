package domain.tax;

import domain.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {
    private Tax anotherTax;

    public Tax(Tax otherTax) {
        this.anotherTax = otherTax;
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        final var taxValue = performCalculation(budget);
        var anotherTaxValue = BigDecimal.ZERO;
        if (anotherTax != null)
            anotherTaxValue = anotherTax.performCalculation(budget);
        return taxValue.add(anotherTaxValue);
    }
}
