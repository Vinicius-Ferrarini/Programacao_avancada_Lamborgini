import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1-Email\n2-SMS\n3-Push\n4-Sair");
            System.out.print("Opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite a mensagem: ");
            String message = scanner.nextLine();

            Notification notification = null;

            switch (option) {
                case 1 -> notification = NotificationFactory.createNotification("email");
                case 2 -> notification = NotificationFactory.createNotification("sms");
                case 3 -> notification = NotificationFactory.createNotification("push");
                case 4 -> System.out.println("Que pena que vai sair ;-;");
                default -> System.out.println("Opção inválida");
            }

            if (notification != null) {
                notification.send(message);
            }

        } while (option != 4);

        scanner.close();
    }
}
