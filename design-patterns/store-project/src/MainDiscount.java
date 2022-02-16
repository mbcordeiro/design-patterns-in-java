import domain.budget.Budget;
import domain.discount.DiscountCalculator;

import java.math.BigDecimal;

public class MainDiscount {
    public static void main(String[] args) {
        final var  budget = new Budget(new BigDecimal("200"), 6);
        final var  budgetSecond = new Budget(new BigDecimal("1000"), 1);
        final var discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budget));
        System.out.println(discountCalculator.calculate(budgetSecond));
    }
}
