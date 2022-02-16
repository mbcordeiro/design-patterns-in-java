package domain.tax;

import domain.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Tax {
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
