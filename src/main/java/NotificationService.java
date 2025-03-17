class NotificationService {
    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notifyUser(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}