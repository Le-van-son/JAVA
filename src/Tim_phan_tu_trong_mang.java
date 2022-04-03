import java.util.Scanner;

public class Tim_phan_tu_trong_mang {
    public static void main(String[] args) {
        String[] arr = {"anh","Sơn","đại","ca"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên hoc sinh là");
        String nhap = scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(nhap)){
                System.out.println("Tên học sinh la  " + nhap +  "vị trí " +i);
            }
        }
    }
}
