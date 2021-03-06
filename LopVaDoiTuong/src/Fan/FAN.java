package Fan;

public class FAN {
    public static final int SLOW = 1,MEDIUM =2 , FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public FAN() {
    }

    public FAN(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(String yelow) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on ==true) {
            return "quạt đang bật tốc độ là "+ this.speed + ",màu "+this.color + ",radius " + this.radius;
        }
        else {
            return  "quạt đang tắt" + " ,màu"+this.color + " ,radius " + this.radius;
        }
    }
}

