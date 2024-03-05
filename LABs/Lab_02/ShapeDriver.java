import javax.swing.JOptionPane;

class Shape {
    double area;
    double volume;

    Shape() {
    }

    Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    Shape(Shape obj) {
        area = obj.area;
        volume = obj.volume;
    }

    void getInput() {
        area = Double.parseDouble(JOptionPane.showInputDialog("Enter volume : "));
        volume = Double.parseDouble(JOptionPane.showInputDialog("Enter volume :"));
    }

    @Override
    public String toString() {
        return "Myclass{area =" + area + ", volume = " + volume + " }";
    }
}

class Square extends Shape {
    double width, length, height;

    Square() {

    }

    Square(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    void getInput() {
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter width"));
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter length"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height "));
        area = length * width;
        volume = length * width * height;
    }

    public String toString() {
        return "Square{width=" + width + ", length=" + length + ", height=" + height + ", area=" + area + ", volume="
                + volume + "}";
    }
}

class Sphere extends Shape {
    double radius;
    final double PI = 3.14;

    Sphere() {

    }

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    void getInput() {
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius "));
        area = 4 * PI * (radius * radius);
        volume = (4 / 3) * (PI * ((radius * radius) * radius));
    }

    @Override
    public String toString() {
        return "Sphere{radius=" + radius + ", area=" + area + ", volume=" + volume + "}";
    }
}

public class ShapeDriver {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.getInput();
        System.out.println("Sphere Details : " + sphere);

        Square square = new Square();
        square.getInput();
        System.out.println("Sphere Details : " + square);
    }

}
