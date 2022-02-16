package domain.tax;

import domain.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    public BigDecimal calculate(Budget budget);
}
