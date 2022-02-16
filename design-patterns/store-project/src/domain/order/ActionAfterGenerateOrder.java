package domain.order;

public interface ActionAfterGenerateOrder {
    public void execute(Order order);
}
