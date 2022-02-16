package domain.budget.status;

import domain.budget.Budget;

import java.math.BigDecimal;

public class BudgedApproved extends BudgetStatus {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setBudgetStatus(new BudgetFinished());
    }
}
