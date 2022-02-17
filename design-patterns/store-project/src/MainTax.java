import domain.budget.Budget;
import domain.tax.ICMS;
import domain.tax.ISS;
import domain.tax.TaxCalculator;

import java.math.BigDecimal;

public class MainTax {
    public static void main(String[] args) {
        final var  budget = new Budget(new BigDecimal("100"), 1);
        final var taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, new ICMS(new ISS(null))));
    }
}
