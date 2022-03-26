package StructuralDesignPatterns.ProxyPattern;

public class Database implements DB{

    @Override
    public void addToDB(String message) {
        System.out.println(message + " successfully added to DB");
    }
}
