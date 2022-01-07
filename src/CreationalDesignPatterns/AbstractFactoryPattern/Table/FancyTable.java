package CreationalDesignPatterns.AbstractFactoryPattern.Table;

public class FancyTable implements Table {

    @Override
    public void cost() {
        System.out.println("Price of Fancy Table is Rs. 15000");
    }

    @Override
    public void size() {
        System.out.println("Size of Study Table is customizable");
    }
}
