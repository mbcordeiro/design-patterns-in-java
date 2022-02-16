package domain.order;

import domain.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {
    private String costumer;
    private BigDecimal budgetValue;
    private int quantityItems;

    public GenerateOrder(String costumer, BigDecimal budgetValue, int quantityItems) {
        this.costumer = costumer;
        this.budgetValue = budgetValue;
        this.quantityItems = quantityItems;
    }

    public String getCostumer() {
        return costumer;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

}
