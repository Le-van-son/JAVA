import java.util.Scanner;

public class nhietdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1.C sang F");
            System.out.println("2. F sang C");
            System.out.println("Nhập lựa chọn");
            chon = input.nextInt();
            switch (chon){
                case 1:
                    System.out.println("Nhập C");
                   double C = input.nextDouble();
                    System.out.println("Đổi C sang F bằng "+ chuyencsangf(C));
                    break;
                case 2:
                    System.out.println("Nhập F");
                    double F = input.nextDouble();
                    System.out.println("Đổi F sang C bằng "+ chuyenfsangC(F));
                    break;
            }

        }while (chon!=0);
        }
        public static double chuyencsangf(double C){
         double F = (5.0 / 9) * ( C - 32);
        return F;
    }
    public static double chuyenfsangC(double F) {
         double C = (9.0 / 5) * F + 32;
        return C;
    }
    }


