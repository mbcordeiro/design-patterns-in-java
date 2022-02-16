import domain.order.GenerateOrder;
import domain.order.GenerateOrderHandler;
import domain.order.PersistOrder;
import domain.order.SendEmailOrder;

import java.math.BigDecimal;
import java.util.List;

public class MainOrder {
    public static void main(String[] args) {
        final var costumer = "Costumer";
        final var budgetValue = new BigDecimal("300");
        final var quantityItems = 2;

        final var generateOrder = new GenerateOrder(costumer, budgetValue, quantityItems);
        final var generateOrderHandler = new GenerateOrderHandler(List.of(new PersistOrder(), new SendEmailOrder()));
        generateOrderHandler.execute(generateOrder);
    }
}
