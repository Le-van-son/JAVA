package Fan;

import java.util.Scanner;

public class mainFan {
    public static void main(String[] args) {
        FAN fan = new FAN();
        System.out.println(fan.toString());
        FAN fan1 = new FAN();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yelow");
        System.out.println(fan1.toString());
    }
}
