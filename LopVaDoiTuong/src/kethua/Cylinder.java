package kethua;

public class Cylinder extends Circle {
    private double h;
    private static String eth;

    public void setH(double h) {
        this.h = h;
    }

    public double getV(){
        return this.h*super.getArea();
    }

    @Override
    public String toString() {
        return "Circle" +
                "radius=" + super.getRadius() +
                ", color='" + color + '\'' +
                  "Thể tích bằng = "+getV();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setH(5.1);
        cylinder.setRadius(2.2);
        cylinder.setColor("red");
        System.out.println(cylinder);
    }
}
