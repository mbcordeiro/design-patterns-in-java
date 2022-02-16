package domain.budget;

import domain.budget.status.BudgetAnalysis;
import domain.budget.status.BudgetStatus;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int quantityItems;
    private BudgetStatus budgetStatus;

    public Budget(BigDecimal value, int quantityItems) {
        this.value = value;
        this.quantityItems = quantityItems;
        this.budgetStatus = new BudgetAnalysis();
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    public BudgetStatus getBudgetStatus() {
        return budgetStatus;
    }

    public void setBudgetStatus(BudgetStatus budgetStatus) {
        this.budgetStatus = budgetStatus;
    }

    public void applyExtraDiscount() {
        var valueExtraDiscount =  this.budgetStatus.calculateExtraDiscount(this);
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

}
