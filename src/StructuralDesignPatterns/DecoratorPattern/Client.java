package StructuralDesignPatterns.DecoratorPattern;

public class Client {
    public static void main(String[] args) {

        Notification email_notifications = new Notify();
        email_notifications.send_notification();

        System.out.println();
        Notification slack_email_notification = new SlackNotify(email_notifications);
        slack_email_notification.send_notification();

        System.out.println();
        Notification sms_email_notification = new SMSNotify(email_notifications);
        sms_email_notification.send_notification();

        System.out.println();
        Notification all = new SMSNotify(new SlackNotify(email_notifications));
        all.send_notification();
    }
}
