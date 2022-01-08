package CreationalDesignPatterns.AbstractFactoryPattern;

public abstract class AbstractFurnitureFactory {
    abstract Furniture getFurniture(FurnitureType type);
}
