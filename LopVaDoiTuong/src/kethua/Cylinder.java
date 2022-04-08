package kethua;

public class Cylinder extends Circle {
    private double h;

    public void setH(double h) {
        this.h = h;
    }

    public double getV(){
        return this.h*super.getArea();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setH(5.1);
        cylinder.setRadius(2.2);
        System.out.println(cylinder.getV());
    }
}
