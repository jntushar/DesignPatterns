package StructuralDesignPatterns.BridgePattern;

public class Circle extends Shape{

    Circle(Color color1, Color color2) {
        super(color1, color2);
    }

    @Override
    public void addShape() {
        System.out.print("Circle shape is added");
        color1.addColor();
        color2.addColor();
    }
}
