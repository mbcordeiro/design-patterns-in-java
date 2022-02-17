package domain.tax;

import domain.budget.Budget;

import java.math.BigDecimal;

public class ICMSWithISS implements Tax{

    public BigDecimal calculate(Budget budget) {
        final var icms = new ICMS().calculate(budget);
        final var iss = new ISS().calculate(budget);
        return icms.add(iss);
    }
}
