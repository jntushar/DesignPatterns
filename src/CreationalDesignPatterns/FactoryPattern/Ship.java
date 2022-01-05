package CreationalDesignPatterns.FactoryPattern;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivery is done by Ship");
    }
}
