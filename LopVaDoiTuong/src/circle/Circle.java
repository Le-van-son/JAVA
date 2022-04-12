package circle;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private static double getRadius() {
        return radius;
    }

    public void setArea() {
    }
    static double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
