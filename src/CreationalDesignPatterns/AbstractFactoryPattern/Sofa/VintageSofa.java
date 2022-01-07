package CreationalDesignPatterns.AbstractFactoryPattern.Sofa;

public class VintageSofa implements Sofa {

    @Override
    public void cost() {
        System.out.println("Price of Vintage Sofa is 50000");
    }

    @Override
    public void isSofaSet() {
        System.out.println("Vintage Sofa is a sofa set");
    }
}
