package CreationalDesignPatterns.FactoryPattern;

public class RoadLogistics extends LogisticsFactory {

    public Transport factory() {
        return new Truck();
    }
}
