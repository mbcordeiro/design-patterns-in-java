package beans.tax;

import beans.budget.Budget;
import beans.tax.Tax;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
