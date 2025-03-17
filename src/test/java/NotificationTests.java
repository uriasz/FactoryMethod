import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationTests {

    @Test
    void testEmailNotification() {
        EmailNotification emailNotification = new EmailNotification();
        assertDoesNotThrow(() -> emailNotification.send("Teste de e-mail"));
    }

    @Test
    void testSMSNotification() {
        SMSNotification smsNotification = new SMSNotification();
        assertDoesNotThrow(() -> smsNotification.send("Teste de SMS"));
    }

    @Test
    void testPushNotification() {
        PushNotification pushNotification = new PushNotification();
        assertDoesNotThrow(() -> pushNotification.send("Teste de Push"));
    }

    @Test
    void testEmailNotificationFactory() {
        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void testSMSNotificationFactory() {
        NotificationFactory factory = new SMSNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof SMSNotification);
    }

    @Test
    void testPushNotificationFactory() {
        NotificationFactory factory = new PushNotificationFactory();
        Notification notification = factory.createNotification();
        assertTrue(notification instanceof PushNotification);
    }

    @Test
    void testNotificationServiceWithEmail() {
        NotificationService service = new NotificationService(new EmailNotificationFactory());
        assertDoesNotThrow(() -> service.notifyUser("Teste de notificação por e-mail"));
    }

    @Test
    void testNotificationServiceWithSMS() {
        NotificationService service = new NotificationService(new SMSNotificationFactory());
        assertDoesNotThrow(() -> service.notifyUser("Teste de notificação por SMS"));
    }

    @Test
    void testNotificationServiceWithPush() {
        NotificationService service = new NotificationService(new PushNotificationFactory());
        assertDoesNotThrow(() -> service.notifyUser("Teste de notificação por Push"));
    }
}
