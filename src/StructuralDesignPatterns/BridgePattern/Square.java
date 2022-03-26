package StructuralDesignPatterns.BridgePattern;

public class Square extends Shape{

    Square(Color color1, Color color2) {
        super(color1, color2);
    }

    @Override
    public void addShape() {
        System.out.print("Square shape is added");
        color1.addColor();
        color2.addColor();
    }
}
