package CreationalDesignPatterns.FactoryPattern;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivery is done by Truck");
    }
}
