package CreationalDesignPatterns.AbstractFactoryPattern.Chair;

public class ErgonomicChair implements Chair {

    @Override
    public void cost() {
        System.out.println("Price of Ergonomic Chair is Rs. 7000");
    }

    @Override
    public void material() {
        System.out.println("Material used in Ergonomic Chair is Polymer");
    }
}
