package CreationalDesignPatterns.AbstractFactoryPattern.Sofa;

public class SofaBed implements Sofa {

    @Override
    public void cost() {
        System.out.println("Price of Sofa cum Bed is 90000");
    }

    @Override
    public void isSofaSet() {
        System.out.println("Sofa cum Bed is not a sofa set");
    }
}
