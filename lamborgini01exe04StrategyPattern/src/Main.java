import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        do {
            System.out.printf("1-Pix\n2-cartao credito\n3-Boleto\n4-Sair\n");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    paymentProcessor.execute(new PixPayment());
                    break;
                case 2:
                    paymentProcessor.execute(new CreditCardPayment());
                    break;
                case 3:
                    paymentProcessor.execute(new BoletoPayment());
                    break;
                case 4:
                    System.out.println("saindo....");
                    break;
                default:
                    System.out.println("Digita certo ai///");
            }
        }while(opcao != 4);

        sc.close();
    }
}