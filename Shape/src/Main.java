public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape oval = new Oval();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape trapezium = new Trapezium();
        ShapeName.printName(circle);
        ShapeName.printName(square);
        ShapeName.printName(oval);
        ShapeName.printName(trapezium);
        ShapeName.printName(triangle);
    }
}