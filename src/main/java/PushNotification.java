class PushNotification implements Notification {
    @Override
    public void send(String message) {
        PushService.sendPush(message);
    }
}