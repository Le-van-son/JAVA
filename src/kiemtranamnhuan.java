import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner kt = new Scanner(System.in);
        System.out.println("Nhập a");
        int year = kt.nextInt();
           if (year%4==0){
               if(year%100!=0){
                   System.out.println(year+" Là năm nhuận");
               }else {
                   System.out.println(year +" Năm không nhuận");
               }
           }else if(year%100 ==0 && year%400==0){
               System.out.println(year+ " Là năm nhuận");
           }else {
               System.out.println(year+" Là năm không nhuận");
           }
    }
}
