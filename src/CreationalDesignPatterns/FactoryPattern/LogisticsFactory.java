package CreationalDesignPatterns.FactoryPattern;

public class LogisticsFactory {

    public Transport factory(Logistics logistics){
        if(logistics == Logistics.ROAD){
            return new RoadLogistics().factory();
        }else if(logistics == Logistics.SEA){
            return new SeaLogistics().factory();
        }
        return null;
    }
}
