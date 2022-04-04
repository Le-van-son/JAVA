import java.util.Scanner;

public class ktra_ngto {
    public static void main(String[] args) {
        Scanner nhapso = new Scanner(System.in);
        System.out.println("Nhap vao");
        int a = nhapso.nextInt();
        if(a<2){
            System.out.print(a+" Không phải sô nguyên tố");
            }
        if (a==2){
            System.out.print(a +" là số nguyên tố");
        }
        if (a>2){
            for (int i = 2; i < a; i++) {
                if (a%i !=0){
                    System.out.print( +a + " Là số nguyên tố");
                }else {
                    System.out.print(a + " Không phải số nguyên tố");
                }
            }
        }
    }
}
