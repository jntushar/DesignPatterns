package CreationalDesignPatterns.FactoryPattern;

public class AirLogistics extends LogisticsFactory{

    public Transport factory(){
        return new Airplanes();
    }
}
