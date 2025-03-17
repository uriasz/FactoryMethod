class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        EmailService.sendEmail(message);
    }
}