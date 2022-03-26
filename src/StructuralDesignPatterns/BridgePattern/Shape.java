package StructuralDesignPatterns.BridgePattern;

public abstract class Shape {
    Color color1;
    Color color2;

    Shape(Color color1, Color color2){
        this.color1 = color1;
        this.color2 = color2;
    }

    public abstract void addShape();
}
