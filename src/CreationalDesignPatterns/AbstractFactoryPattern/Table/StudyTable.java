package CreationalDesignPatterns.AbstractFactoryPattern.Table;

public class StudyTable implements Table {

    @Override
    public void cost() {
        System.out.println("Price of Study Table is Rs. 5000");
    }

    @Override
    public void size() {
        System.out.println("Size of Study Table is 4x6");
    }
}
