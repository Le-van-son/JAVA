import java.util.Scanner;

public class Gpt_b1 {
    public static void main(String[] args) {
        double x;
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = ip.nextDouble();
        System.out.println("Nhap b");
        double b = ip.nextDouble();
        if (a == 0) {
            if (b==0){
                System.out.println("Pt có vô số nghiệm");
            }else {
                System.out.println("Pt vô nghiệm");
            }

        }else {
            x = -b/a;
            System.out.println("Pt có nghiệm là : x = " +x);
        }
    }
}
