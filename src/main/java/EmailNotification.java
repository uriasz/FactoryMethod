class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        EmailService.sendEmail(message);  // Simulação de envio de e-mail
    }
}