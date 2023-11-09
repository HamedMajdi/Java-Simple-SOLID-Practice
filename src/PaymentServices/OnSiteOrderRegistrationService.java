package PaymentServices;

public class OnSiteOrderRegistrationService implements OrderRegistrationService, OrderPaymentService {

    @Override
    public void processPayment(int foodPrice) {
        System.out.println("On-site payment with price: " + foodPrice + " Tomans!");

    }

    @Override
    public void registerOrder(String customerName) {
        System.out.println("On-site order registered for " + customerName);

    }
}
