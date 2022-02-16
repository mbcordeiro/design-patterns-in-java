package domain.budget.status;

import domain.budget.Budget;

public class BudgetReproved extends BudgetStatus {
    @Override
    public void finish(Budget budget) {
        budget.setBudgetStatus(new BudgetFinished());
    }
}
