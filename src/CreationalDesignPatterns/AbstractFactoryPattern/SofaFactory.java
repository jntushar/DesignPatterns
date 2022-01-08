package CreationalDesignPatterns.AbstractFactoryPattern;

public class SofaFactory extends AbstractFurnitureFactory{

    @Override
    Furniture getFurniture(FurnitureType type) {
        switch (type){
            case MODERN_SOFA: return new ModernSofa();
            case VINTAGE_SOFA: return new VintageSofa();
            default: return null;
        }
    }
}
