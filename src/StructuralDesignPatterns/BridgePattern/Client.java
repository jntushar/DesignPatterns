package StructuralDesignPatterns.BridgePattern;

public class Client {
    public static void main(String[] args) {
        Shape square = new Square(new Red(), new Blue());
        square.addShape();
    }
}
