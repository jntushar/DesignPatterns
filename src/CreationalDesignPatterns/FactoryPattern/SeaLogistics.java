package CreationalDesignPatterns.FactoryPattern;

public class SeaLogistics extends LogisticsFactory {

    public Transport factory(){
        return new Truck();
    }
}
