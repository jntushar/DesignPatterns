package StructuralDesignPatterns.DecoratorPattern;

public class SMSNotify extends Decorator{

    public SMSNotify(Notification notification) {
        super(notification);
    }

    @Override
    public void send_notification(){
        super.send_notification();
        System.out.print(" Sending SMS Notification");
    }
}
