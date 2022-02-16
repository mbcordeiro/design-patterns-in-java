import domain.budget.Budget;
import domain.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MainOrder {
    public static void main(String[] args) {
        final var budget = new Budget(new BigDecimal("600"), 4);
        final var order = new Order("Costumer", LocalDateTime.now(), budget);

        System.out.println("Persist order in database");
        System.out.println("Send email with data new order");

    }
}
