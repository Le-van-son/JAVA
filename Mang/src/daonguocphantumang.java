import java.util.Scanner;

public class daonguocphantumang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size mảng");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        System.out.print( "Elements in array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.print( "\n Reverse array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
