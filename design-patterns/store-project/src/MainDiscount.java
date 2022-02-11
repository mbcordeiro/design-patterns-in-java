import beans.budget.Budget;
import beans.discount.DiscountCalculator;
import beans.tax.ICMS;
import beans.tax.ISS;
import beans.tax.TaxCalculator;

import java.math.BigDecimal;

public class MainDiscount {
    public static void main(String[] args) {
        final var  budget = new Budget(new BigDecimal("200"), 4);
        final var  budgetSecond = new Budget(new BigDecimal("1000"), 1);
        final var discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budget));
        System.out.println(discountCalculator.calculate(budgetSecond));
    }
}
