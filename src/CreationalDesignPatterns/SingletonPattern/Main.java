package CreationalDesignPatterns.SingletonPattern;

import CreationalDesignPatterns.FactoryPattern.Logistics;
import CreationalDesignPatterns.FactoryPattern.LogisticsFactory;
import CreationalDesignPatterns.FactoryPattern.Transport;

public class Main {
    public static void main(String[] args) {

        /**
         *     private LogisticsFactory(){}
         *
         *     public static LogisticsFactory getInstance(){
         *         return new LogisticsFactory();
         *     }
         */

        LogisticsFactory logisticsFactory = LogisticsFactory.getInstance();
        Transport airplane = logisticsFactory.factory(Logistics.AIR);
        airplane.deliver();
    }
}
