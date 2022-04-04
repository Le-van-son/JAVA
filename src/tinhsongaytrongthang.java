import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner demngay = new Scanner(System.in);
        System.out.println("Enter Month");
        int Month = demngay.nextInt();
        switch (Month){
            case 2:
                System.out.println(" Month " +Month+ " has 28days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" Month "+Month+" has 31days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" Month "+Month+" has 30days");
        }
    }
}
