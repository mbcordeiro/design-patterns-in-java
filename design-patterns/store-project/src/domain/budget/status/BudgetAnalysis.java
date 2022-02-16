package domain.budget.status;

import domain.budget.Budget;

import java.math.BigDecimal;

public class BudgetAnalysis extends BudgetStatus {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setBudgetStatus(new BudgedApproved());
    }

    @Override
    public void finish(Budget budget) {
        budget.setBudgetStatus(new BudgetFinished());
    }
}
