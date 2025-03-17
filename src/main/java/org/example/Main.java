public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailNotificationFactory());
        notificationService.notifyUser("Sua fatura está disponível.");
    }
}