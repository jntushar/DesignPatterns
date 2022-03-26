package StructuralDesignPatterns.BridgePattern;

public class Red implements Color{

    @Override
    public void addColor() {
        System.out.print(" with red and ");
    }
}
