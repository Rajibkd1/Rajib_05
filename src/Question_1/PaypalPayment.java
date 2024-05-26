package Question_1;

public class PaypalPayment implements PaymentState{
    @Override
    public boolean makePayment(double amount) {
        System.out.println("Making payment via Paypal");
        return true;
    }
}
