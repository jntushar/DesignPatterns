package CreationalDesignPatterns.AbstractFactoryPattern.Table;

public class DiningTable implements Table {

    @Override
    public void cost() {
        System.out.println("Price of Dining Table is Rs. 10000");
    }

    @Override
    public void size() {
        System.out.println("Size of Study Table is 8x10");
    }
}
