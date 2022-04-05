import java.util.Scanner;

public class Timgiatrilonnhattrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Mời nhập phần tử của mảng");
            arr[i] = scanner.nextInt();
        }
//        System.out.println(" mảng");
        int max = arr[0];
        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + "\t");
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\n Max = " + max);
    }
}
