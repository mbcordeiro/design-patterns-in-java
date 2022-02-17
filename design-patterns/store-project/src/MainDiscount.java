import domain.budget.Budget;
import domain.budget.BudgetItem;
import domain.discount.DiscountCalculator;

import java.math.BigDecimal;

public class MainDiscount {
    public static void main(String[] args) {
        final var  budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("200")));

        final var  budgetSecond = new Budget();
        budgetSecond.addItem(new BudgetItem(new BigDecimal("1000")));

        final var  budgetThird = new Budget();
        budgetThird.addItem(new BudgetItem(new BigDecimal("500")));

        final var discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budget));
        System.out.println(discountCalculator.calculate(budgetSecond));
        System.out.println(discountCalculator.calculate(budgetThird));
        System.out.println(discountCalculator.calculate(budgetThird));
    }
}
