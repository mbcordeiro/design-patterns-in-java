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

    public void execute() {
        final var budget = new Budget(this.budgetValue, this.quantityItems);
        final var order = new Order(this.costumer, LocalDateTime.now(), budget);

        System.out.println("Persist order in database");
        System.out.println("Send email with data new order");
    }
}
