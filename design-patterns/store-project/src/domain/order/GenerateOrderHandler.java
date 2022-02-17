package domain.order;

import domain.budget.Budget;
import domain.budget.BudgetItem;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {
    private List<ActionAfterGenerateOrder> actionAfterGenerateOrderList;

    public GenerateOrderHandler(List<ActionAfterGenerateOrder> afterGenerateOrderList) {
        this.actionAfterGenerateOrderList = afterGenerateOrderList;
    }

    public void execute(GenerateOrder generateOrder) {
        final var budget = new Budget();
        budget.addItem(new BudgetItem(generateOrder.getBudgetValue()));
        final var order = new Order(generateOrder.getCostumer(), LocalDateTime.now(), budget);

        this.actionAfterGenerateOrderList.forEach(action -> action.execute(order));
    }
}
