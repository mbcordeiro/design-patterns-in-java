package domain.order;

public class SendEmailOrder implements ActionAfterGenerateOrder{
    @Override
    public void execute(Order order) {
        System.out.println("Send email with data new order");
    }
}
