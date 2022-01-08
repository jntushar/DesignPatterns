package CreationalDesignPatterns.SingletonPattern;

public class DataBase {

    private DataBase(){}

    public static DataBase getInstance(){
        return new DataBase();
    }

    public void print(){
        System.out.println("We're in DataBase");
    }
}
