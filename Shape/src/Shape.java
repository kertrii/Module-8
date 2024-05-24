public abstract class Shape {
    public abstract String getName();
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Oval extends Shape {
    @Override
    public String getName() {
        return "Oval";
    }
}

class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

class Trapezium extends Shape {
    @Override
    public String getName() {
        return "Trapezium";
    }
}

class ShapeName {
    public static void printName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}

class Test {
    public static void test(Shape shape) {
        System.out.println("test");
    }
}
