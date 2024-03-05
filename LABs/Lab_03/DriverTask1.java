interface Shape {
    double CalculateArea();

    double CalculatePerimeter();
}

class Circle implements Shape {

    float radius;
    final double PI = 3.14;

    Circle() {
    }

    Circle(float r) {
        this.radius = r;
    }

    Circle(Circle obj) {
        this.radius = obj.radius;
    }

    public double CalculateArea() {
        return PI * (radius * radius);
    }

    public double CalculatePerimeter() {
        return 2 * PI * radius;
    }
}

class Rectangle implements Shape {

    float length, width;

    Rectangle() {
    }

    Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    Rectangle(Rectangle obj) {
        this.length = obj.length;
        this.width = obj.width;
    }

    public double CalculateArea() {
        return length * width;
    }

    public double CalculatePerimeter() {
        return 2 * (length + width);
    }
}

class Square implements Shape {

    float length, width;

    Square() {
    }

    Square(float l, float w) {
        this.length = l;
        this.width = w;
    }

    Square(Square obj) {
        this.length = obj.length;
        this.width = obj.width;

    }

    public double CalculateArea() {
        return length * length;
    }

    public double CalculatePerimeter() {
        return 4 * length;
    }
}

class DriverTask1 {
    public static void main(String[] args) {
        Shape[] ss = new Shape[] { new Circle(2), new Rectangle(2, 3), new Square(9, 6) };
        for (Shape s : ss) {
            // if (s instanceof Circle) # Gives only the value of the Circle
            System.out.println("Area :" + s.CalculateArea());
            System.out.println("Perimeter :" + s.CalculatePerimeter());
        }
    }
}