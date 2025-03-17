class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        SMSService.sendSMS(message);
    }
}