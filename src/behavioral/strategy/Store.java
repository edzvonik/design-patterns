package behavioral.strategy;

import behavioral.strategy.PayStrategies.PayByCard;
import behavioral.strategy.PayStrategies.PayByCash;
import behavioral.strategy.PayStrategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Store {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select a payment method: "
                + "\n1 - Cash"
                + "\n2 - Card");
        int choice = Integer.parseInt(reader.readLine());
        PayStrategy strategy = null;

        if (choice == 1) {
            strategy = new PayByCash();
        } else {
            strategy = new PayByCard();
        }

        strategy.pay(555);
    }

}
