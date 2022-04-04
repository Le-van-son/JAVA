import java.util.Scanner;

public class tinh_lai_ngan_hang {
    public static void main(String[] args) {
        Scanner tinhlai = new Scanner(System.in);
        System.out.println(" Nhập số tiền gửi :");
        float tiengui = tinhlai.nextFloat();
        System.out.println("Nhập Lãi suất:");
        float laisuat = tinhlai.nextFloat();
        System.out.println("Nhập số Tháng gửi :");
        int thanggui = tinhlai.nextInt();
        float tienlai = 0;
        for (int i = 0; i < thanggui; i++) {
            tienlai += tiengui * laisuat / 12 * thanggui;
        }
        System.out.printf("Lãi bằng : 10%f" ,tienlai);
    }
}
