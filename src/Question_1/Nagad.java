package Question_1;

public class Nagad implements PaymentState{
    @Override
    public boolean makePayment(double amount) {
        System.out.println("Making payment via mobile banking Nagad");
        return true;
    }
}
