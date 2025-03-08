public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amout) {
        System.out.println("Quero numero do seu cartao");
        System.out.println("Confirmo o pagamento.");
    }

    public CreditCardPayment() {
    }
}
