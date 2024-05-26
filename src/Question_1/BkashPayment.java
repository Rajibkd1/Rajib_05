package Question_1;

public class BkashPayment implements PaymentState{
    @Override
    public boolean makePayment(double amount) {
        System.out.println("Making payment via mobile banking bkasj");
        return true;
    }
}
