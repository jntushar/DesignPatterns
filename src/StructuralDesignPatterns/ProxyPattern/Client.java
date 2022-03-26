package StructuralDesignPatterns.ProxyPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseProxy database = new DatabaseProxy();
        database.addToDB("like share subscribe");
    }
}
