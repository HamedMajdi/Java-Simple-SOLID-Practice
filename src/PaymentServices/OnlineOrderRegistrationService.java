package PaymentServices;

public class OnlineOrderRegistrationService implements OrderRegistrationService, OrderPaymentService {


    @Override
    public void processPayment(int foodPrice) {
        System.out.println("Online payment with price: " + foodPrice + " Tomans!");

    }

    @Override
    public void registerOrder(String customerName) {
        System.out.println("Online order registered for " + customerName);

    }
}
