package beans.tax;

import beans.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    public BigDecimal calculate(Budget budget);
}
