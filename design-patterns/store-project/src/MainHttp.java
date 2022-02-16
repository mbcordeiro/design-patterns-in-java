import domain.budget.Budget;
import domain.budget.BudgetRecord;
import domain.http.JavahHttpClient;

import java.math.BigDecimal;

public class MainHttp {
    public static void main(String[] args) {
        final var budget = new Budget(BigDecimal.TEN, 6);
        budget.approve();
        budget.finish();

        final var budgetRecord = new BudgetRecord(new JavahHttpClient());
        budgetRecord.register(budget);
    }
}
