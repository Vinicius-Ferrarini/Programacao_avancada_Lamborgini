import java.util.Scanner;

public class PaymentProcessor{
    Scanner sc = new Scanner(System.in);
    void execute(PaymentStrategy strategy){
        System.out.println("valor do amount");
        strategy.processPayment(sc.nextDouble());




    }


}
