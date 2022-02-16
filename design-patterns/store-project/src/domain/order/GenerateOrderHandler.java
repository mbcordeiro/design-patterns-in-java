package domain.order;

import domain.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {
    public void execute(GenerateOrder generateOrder) {
        final var budget = new Budget(generateOrder.getBudgetValue(), generateOrder.getQuantityItems());
        final var order = new Order(generateOrder.getCostumer(), LocalDateTime.now(), budget);

        final var sendEmailOrder = new SendEmailOrder();
        final var persistOrder = new PersistOrder();

        sendEmailOrder.send(order);
        persistOrder.persist(order);
    }
}
