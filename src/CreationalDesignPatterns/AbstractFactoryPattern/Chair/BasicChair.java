package CreationalDesignPatterns.AbstractFactoryPattern.Chair;

public class BasicChair implements Chair {

    @Override
    public void cost() {
        System.out.println("Price of Basic Chair is Rs. 1000");
    }

    @Override
    public void material() {
        System.out.println("Material used in Basic Chair is Plastic");
    }
}
