package domain.order;

public class PersistOrder implements ActionAfterGenerateOrder{
    @Override
    public void execute(Order order) {
        System.out.println("Persist order in database");
    }
}
