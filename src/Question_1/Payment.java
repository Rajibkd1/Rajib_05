package Question_1;

public class Payment {
    private PaymentState paymentState;

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }
    public boolean makePayment(double amount) {
        if (paymentState == null) {
            System.out.println("Payment nothings");
            return false;
        }
        return paymentState.makePayment(amount);
    }

}
