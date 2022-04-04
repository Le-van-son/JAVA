import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner kt = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = kt.nextInt();
           if (a%4==0){
               if(a%100!=0){
                   System.out.println(a+" Là năm nhuận");
               }else {
                   System.out.println(a +" Năm không nhuận");
               }
           }else if(a%100 ==0 && a%400==0){
               System.out.println(a+ " Là năm nhuận");
           }else {
               System.out.println(a+" Là năm không nhuận");
           }
    }
}
