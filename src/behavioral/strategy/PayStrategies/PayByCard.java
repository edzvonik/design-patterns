package behavioral.strategy.PayStrategies;

public class PayByCard implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Pay by card - " + paymentAmount);
    }

}
