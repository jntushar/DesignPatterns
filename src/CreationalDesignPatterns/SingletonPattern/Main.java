package CreationalDesignPatterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        db.print();
    }
}
