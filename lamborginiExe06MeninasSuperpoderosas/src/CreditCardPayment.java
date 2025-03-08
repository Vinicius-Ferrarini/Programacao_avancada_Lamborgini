class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado via Cartão de Crédito.");
    }
}