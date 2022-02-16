package domain.tax;

import domain.budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax {
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.6"));
    }
}