package domain.budget;

import java.math.BigDecimal;

public class BudgetProxy extends Budget {
    private BigDecimal value;
    private Budget budget;

    public BudgetProxy(Budget budget) {
        this.budget = budget;
    }

    @Override
    public BigDecimal getValue() {
        if (this.value == null)
            this.value = this.budget.getValue();

        return this.value;
    }
}
