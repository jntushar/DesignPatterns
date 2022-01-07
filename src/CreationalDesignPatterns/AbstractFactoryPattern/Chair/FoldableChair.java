package CreationalDesignPatterns.AbstractFactoryPattern.Chair;

public class FoldableChair implements Chair {

    @Override
    public void cost() {
        System.out.println("Price of Foldable Chair is Rs. 3000");
    }

    @Override
    public void material() {
        System.out.println("Material used in Foldable Chair is Iron");
    }
}
