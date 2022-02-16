package domain.order;

import domain.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String costumer;
    private LocalDateTime orderDate;
    private Budget budget;

    public Order(String costumer, LocalDateTime orderDate, Budget budget) {
        this.costumer = costumer;
        this.orderDate = orderDate;
        this.budget = budget;
    }

    public String getCostumer() {
        return costumer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Budget getBudget() {
        return budget;
    }
}
