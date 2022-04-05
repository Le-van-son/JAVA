import java.util.Scanner;

public class timmintrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Mời nhập phần tử" + i + "trong mảng");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Min của mảng là " + timmin(arr));
    }
    public static int timmin(int[]arr) {
       int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}

