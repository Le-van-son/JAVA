import java.util.Scanner;

public class timuocchunglonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scanner.nextInt();
        System.out.println("Nhap b");
        int b = scanner.nextInt();
        if (a==0 || b==0){
            System.out.println("Lỗi bạn ei");
        }
        else if (a >= b) {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 & b % i == 0) {
                    System.out.println("UCLN là " + i);
                    break;
                }
            }
        }
        if (a<b){
            for (int i = a; i >0 ; i--) {
                if (a%i==0 && b%i==0){
                    System.out.println("UCLN là " +i);
                    break;
                }
            }
        }


    }
}