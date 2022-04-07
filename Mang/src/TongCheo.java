import java.util.Scanner;

public class TongCheo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 9},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sum1 =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            sum1=sum1+arr[i][arr.length-1-i];
        }
        System.out.println(sum1);

    }
}
