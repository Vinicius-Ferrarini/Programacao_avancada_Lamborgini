public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amout) {
        System.out.println("Toma os codigos dos boletos...");
    }

    public BoletoPayment() {
    }
}
