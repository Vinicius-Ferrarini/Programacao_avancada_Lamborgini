class BoletoPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado via Boleto.");
    }
}