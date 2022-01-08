package CreationalDesignPatterns.AbstractFactoryPattern;

public class TableFactory extends AbstractFurnitureFactory{

    @Override
    Furniture getFurniture(FurnitureType type) {
        switch (type){
            case MODERN_TABLE: return new ModernTable();
            case VINTAGE_TABLE: return new VintageTable();
            default: return null;
        }
    }
}
