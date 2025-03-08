import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");

        int option = scanner.nextInt();

        System.out.println("Digite o valor da transação:");
        double amount = scanner.nextDouble();

        try {
            PaymentStrategy paymentMethod = PaymentFactory.getPaymentMethod(option);
            PaymentProcessor processor = new PaymentProcessor(paymentMethod);
            processor.processPayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
