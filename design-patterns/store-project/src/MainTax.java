import beans.budget.Budget;
import beans.tax.ICMS;
import beans.tax.ISS;
import beans.tax.TaxCalculator;

import java.math.BigDecimal;

public class MainTax {
    public static void main(String[] args) {
        final var  budget = new Budget(new BigDecimal("100"), 1);
        final var taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, new ICMS()));
        System.out.println(taxCalculator.calculate(budget, new ISS()));
    }
}
