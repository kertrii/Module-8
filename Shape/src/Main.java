public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Oval oval = new Oval();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Trapezium trapezium = new Trapezium();
        ShapeName.printName(circle);
        ShapeName.printName(square);
        ShapeName.printName(oval);
        ShapeName.printName(trapezium);
        ShapeName.printName(triangle);
    }
}