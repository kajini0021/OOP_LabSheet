public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape() {
        this.colour = "red";
        this.filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "shape[colour=" + colour + ", filled=" + filled + "]";
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + ", radius=" + radius + "]";
    }
}


class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle [" + super.toString() + ", width=" + width + ", length=" + length+"]";
    }
}
class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side, colour, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
class Main1 {
    public static void main(String []args) {
        Circle circle = new Circle(5.0, "red", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "blue", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(2.5, "green", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}