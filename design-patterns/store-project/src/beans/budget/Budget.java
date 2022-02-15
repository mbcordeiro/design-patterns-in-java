package beans.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int quantityItems;
    private String budgetStatus;

    public Budget(BigDecimal value, int quantityItems) {
        this.value = value;
        this.quantityItems = quantityItems;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    public void applyExtraDiscount() {
        var valueExtraDiscount =  BigDecimal.ZERO;
        if (budgetStatus.equals("ANALYSIS")) valueExtraDiscount = new BigDecimal("0.05");
        else if (budgetStatus.equals("APPROVED")) valueExtraDiscount = new BigDecimal("0.02");
        this.value = this.value.subtract(valueExtraDiscount);
    }

    public void approveBudgetStatus() {
        this.budgetStatus = "APPROVED";
    }
}
