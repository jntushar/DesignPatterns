package StructuralDesignPatterns.DecoratorPattern;

public class Decorator implements Notification{

    private Notification notification;

    public Decorator(Notification notification){
        this.notification = notification;
    }

    @Override
    public void send_notification() {
        this.notification.send_notification();
    }
}
