import domain.budget.Budget;
import domain.budget.BudgetItem;

import java.math.BigDecimal;

public class MainComposite {
    public static void main(String[] args) {
        final var budgetOld = new Budget();
        budgetOld.addItem(new BudgetItem(new BigDecimal("200")));
        budgetOld.reprove();

        final var budgetNew = new Budget();
        budgetNew.addItem(new BudgetItem(new BigDecimal("500")));
        budgetNew.addItem(budgetOld);

        System.out.println(budgetNew.getValue());
    }
}
