package CreationalDesignPatterns.FactoryPattern;

public class LogisticsApp {
    public static void main(String[] args) {
        LogisticsFactory logisticsFactory = new LogisticsFactory();
        Transport airplane = logisticsFactory.factory(Logistics.AIR);
        airplane.deliver();
    }
}
