import beans.Budget;
import beans.ICMS;
import beans.ISS;
import beans.TaxCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        final var  budget = new Budget(new BigDecimal("100"));
        final var taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, new ICMS()));
        System.out.println(taxCalculator.calculate(budget, new ISS()));
    }
}
