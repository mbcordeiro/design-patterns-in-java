import domain.order.GenerateOrder;

import java.math.BigDecimal;

public class MainOrder {
    public static void main(String[] args) {
        final var costumer = args[0];
        final var budgetValue = new BigDecimal(args[1]);
        final var quantityItems = Integer.parseInt(args[2]);

        final var generateOrder = new GenerateOrder(costumer, budgetValue, quantityItems);
        generateOrder.execute();
    }
}
