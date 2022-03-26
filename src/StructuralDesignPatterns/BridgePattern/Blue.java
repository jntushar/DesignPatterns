package StructuralDesignPatterns.BridgePattern;

public class Blue implements Color{

    @Override
    public void addColor() {
        System.out.print("blue color");
    }
}
