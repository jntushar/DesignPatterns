package StructuralDesignPatterns.ProxyPattern;

import java.util.Locale;

public class DatabaseProxy implements DB{

    private Database database;

    public DatabaseProxy(){
        database = new Database();
    }

    @Override
    public void addToDB(String message) {
        message = message.toUpperCase(Locale.ROOT);
        database.addToDB(message);
    }
}
