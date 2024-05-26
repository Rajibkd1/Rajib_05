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

    public static void main(String[] args) {
        Payment paymentSystem = new Payment();
        paymentSystem.setPaymentState(new BankPayment());
        System.out.println("Payment: " + paymentSystem.makePayment(200));

        paymentSystem.setPaymentState(new BkashPayment());
        System.out.println("Payment : " + paymentSystem.makePayment(520));
        paymentSystem.setPaymentState(new CreditPayment());
        System.out.println("Payment: " + paymentSystem.makePayment(510));

        paymentSystem.setPaymentState(new Nagad());
        System.out.println("Payment: " + paymentSystem.makePayment((500)));
    }

}
