
interface TwoDimensionalShape {
    double getArea();
}

class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

class Square implements TwoDimensionalShape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square with side length " + sideLength;
    }
}

class Triangle implements TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}

public class ShapeDriver {
    public static void main(String[] args) {
        TwoDimensionalShape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(3, 6)
        };

        for (TwoDimensionalShape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle Area: " + shape.getArea());
            } else if (shape instanceof Square) {
                System.out.println("Square Area: " + shape.getArea());
            } else if (shape instanceof Triangle) {
                System.out.println("Triangle Area: " + shape.getArea());
            }

            // Print object description using toString() method override
            System.out.println(shape);
        }
    }
}
