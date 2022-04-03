import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
//        System.out.println("hello world");
        int a;
        int b;
        int Sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        a = scanner.nextInt();
        System.out.println("nhập b");
        b = scanner.nextInt();
        Sum = a + b;
        System.out.println("T là = " + Sum);
    }
}