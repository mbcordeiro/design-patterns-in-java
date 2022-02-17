package domain.budget;

import domain.budget.status.BudgetAnalysis;
import domain.budget.status.BudgetFinished;
import domain.budget.status.BudgetStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable{
    private BigDecimal value;
    private BudgetStatus budgetStatus;
    private List<Budgetable> budgetItems;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.budgetItems = new ArrayList<>();
        this.budgetStatus = new BudgetAnalysis();
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return budgetItems.size();
    }

    public BudgetStatus getBudgetStatus() {
        return budgetStatus;
    }

    public void setBudgetStatus(BudgetStatus budgetStatus) {
        this.budgetStatus = budgetStatus;
    }

    public void applyExtraDiscount() {
        final var valueExtraDiscount =  this.budgetStatus.calculateExtraDiscount(this);
        this.value = this.value.subtract(valueExtraDiscount);
    }

    public void approve() {
        this.budgetStatus.approve(this);
    }

    public void reprove() {
        this.budgetStatus.reprove(this);
    }

    public void finish() {
        this.budgetStatus.finish(this);
    }

    public boolean isFinish() {
        return budgetStatus instanceof BudgetFinished;
    }

    public void addItem(Budgetable budgetable) {
        this.value = value.add(budgetable.getValue());
        this.budgetItems.add(budgetable);
    }
}
