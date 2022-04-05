import java.util.Scanner;

public class timvitriphantutrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nMời nhập số");
        int phantu = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == phantu) {
                System.out.print("Vị trí của " + phantu + " là :" + i);
                count = count + 1;
            }
        }
        if (count == 0) {
            System.out.println("Ko thuoc mảng");
        }
    }
}
