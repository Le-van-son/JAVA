import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        String[] arr = {"ZEZO", "ONE", "TWO", "THREE",
                "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int number = scanner.nextInt();
        if (number < 10) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[number]);
                break;
            }
        }
        if (number >= 10 && number < 100) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[(number / 10)]  + arr[number % 10]);
                break;
            }
        }
        if(number>=100) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[number / 100] + "hundred" + arr[(number % 100) / 10]+"ty"+ arr[number % 10]);
                break;
            }
        }
    }
}
