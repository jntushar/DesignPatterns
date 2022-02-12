package StructuralDesignPatterns.DecoratorPattern;

public class Notify implements Notification{
    @Override
    public void send_notification() {
        System.out.print("Sending Email Notification");
    }
}
