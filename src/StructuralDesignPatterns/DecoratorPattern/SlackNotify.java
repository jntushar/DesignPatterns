package StructuralDesignPatterns.DecoratorPattern;

public class SlackNotify extends Decorator{

    public SlackNotify(Notification notification) {
        super(notification);
    }

    @Override
    public void send_notification(){
        super.send_notification();
        System.out.print(" Sending Slack Notification");
    }
}
