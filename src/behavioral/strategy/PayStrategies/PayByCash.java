package behavioral.strategy.PayStrategies;

public class PayByCash implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Pay by cash - " + paymentAmount);
    }

}
