public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("notificacao e email!!! "+ message);
    }
}
