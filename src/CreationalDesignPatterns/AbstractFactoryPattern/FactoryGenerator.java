package CreationalDesignPatterns.AbstractFactoryPattern;

public class FactoryGenerator {
    public static AbstractFurnitureFactory getFactory(FactoryType type){
        switch (type){
            case SOFA_FACTORY: return new SofaFactory();
            case TABLE_FACTORY: return new TableFactory();
            default: return null;
        }
    }
}
