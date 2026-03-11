package newpackage1;

abstract class Shape {

    public abstract void draw();

    public String getColor() {
        return "Red";
    }
}

class Rectangle extends Shape {

    public void draw() {
        System.out.println("Draw Rectangle with color " + getColor());
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Draw Circle with color " + getColor());
    }
}

public class ShapeApp {

    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        s1.draw();
        s2.draw();
    }
}