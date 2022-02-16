package domain.order;

import domain.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {
    public void execute(GenerateOrder generateOrder) {
        final var budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getQuantityItems());
        new Order(generateOrder.getCostumer(), LocalDateTime.now(), budget);

        System.out.println("Persist order in database");
        System.out.println("Send email with data new order");
    }
}
