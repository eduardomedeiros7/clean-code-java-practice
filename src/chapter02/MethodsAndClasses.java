package chapter02;


public class MethodsAndClasses {

    class PaymentProcessor {

        private double amount;

        public void processPayment() {
            System.out.println("Processing...");
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}