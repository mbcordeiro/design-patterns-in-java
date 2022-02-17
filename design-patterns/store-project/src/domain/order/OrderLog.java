package domain.order;

public class OrderLog implements ActionAfterGenerateOrder{
    @Override
    public void execute(Order order) {
        System.out.println(String.format("Order generate: %S", order));
    }
}
