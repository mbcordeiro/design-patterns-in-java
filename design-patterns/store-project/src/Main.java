import beans.Budget;
import beans.TaxCalculator;
import beans.enums.TaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        final var  budget = new Budget(new BigDecimal("100"));
        final var taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, TaxType.ICMS));
        System.out.println(taxCalculator.calculate(budget, TaxType.ISS));
    }
}
