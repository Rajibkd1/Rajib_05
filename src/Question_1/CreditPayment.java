package Question_1;

public class CreditPayment implements PaymentState{
        @Override
        public boolean makePayment(double amount) {
                System.out.println("Making payment using credit card");
                return true;
        }
}
