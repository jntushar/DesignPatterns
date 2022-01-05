package CreationalDesignPatterns.FactoryPattern;

public class Airplanes implements Transport{

    @Override
    public void deliver(){
        System.out.println("Delivery is done by Airplanes");
    }
}
