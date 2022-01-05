package CreationalDesignPatterns.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        LogisticsFactory logisticsFactory = new LogisticsFactory();
        Transport transport = logisticsFactory.factory(Logistics.ROAD);
        transport.deliver();
    }
}
