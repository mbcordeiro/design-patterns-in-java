package domain.budget;

import domain.exception.DomainException;
import domain.http.HttpAdapter;

import java.net.MalformedURLException;
import java.util.Map;

public class BudgetRecord {
    private HttpAdapter httpAdapter;

    public BudgetRecord(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void register(Budget budget) throws MalformedURLException {
        if (!budget.isFinish())
            throw new DomainException("Budget not Finished");
        final var url = "https://api/budget";
        final Map<String, Object> data = Map.of("value", budget.getValue(), "quantityItems", budget.getQuantityItems());
        httpAdapter.post(url, data);
    }
}
