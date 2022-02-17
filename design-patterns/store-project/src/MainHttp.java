import domain.budget.Budget;
import domain.budget.BudgetItem;
import domain.budget.BudgetRecord;
import domain.http.JavahHttpClient;

import java.math.BigDecimal;
import java.net.MalformedURLException;

public class MainHttp {
    public static void main(String[] args) throws MalformedURLException {
        final var budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("10")));
        budget.approve();
        budget.finish();

        final var budgetRecord = new BudgetRecord(new JavahHttpClient());
        budgetRecord.register(budget);
    }
}
