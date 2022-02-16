package domain.budget.status;

import domain.budget.Budget;
import domain.exception.DomainException;

import java.math.BigDecimal;

public abstract class BudgetStatus {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new DomainException("Budget cannot be approved!");
    }

    public void reprove(Budget budget) {
        throw new DomainException("Budget cannot be reproved!");
    }

    public void finish(Budget budget) {
        throw new DomainException("Budget cannot be finished!");
    }

}
