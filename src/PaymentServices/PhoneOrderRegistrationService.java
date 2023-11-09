package PaymentServices;

public class PhoneOrderRegistrationService implements OrderRegistrationService, OrderPaymentService  {

    @Override
    public void registerOrder(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    @Override
    public void processPayment(int foodPrice) {
        System.out.println("Phone payment with price: " + foodPrice + " Tomans!");
    }
}
