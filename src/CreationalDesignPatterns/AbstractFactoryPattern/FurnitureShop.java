package CreationalDesignPatterns.AbstractFactoryPattern;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture modern_sofa = FactoryGenerator.getFactory(FactoryType.SOFA_FACTORY).getFurniture(FurnitureType.MODERN_SOFA);
        System.out.println(modern_sofa.getDetails());

    }
}
