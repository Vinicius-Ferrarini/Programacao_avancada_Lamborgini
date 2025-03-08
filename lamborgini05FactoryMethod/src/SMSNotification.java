public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Recebe SMS!! "+ message);
    }
}
