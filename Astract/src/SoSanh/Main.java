package SoSanh;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(3.3);

        System.out.println("Kích thước Circle chưa sắp xếp là: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleCoparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Sau khi sắp xếp :");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
    }

