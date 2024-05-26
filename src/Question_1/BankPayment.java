package Question_1;

public class BankPayment implements PaymentState{
    @Override
    public boolean makePayment(double amount) {
        System.out.println("Making payment via Bank systema");
        return true;
    }
}
