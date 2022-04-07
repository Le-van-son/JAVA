import java.util.Scanner;

public class Xoaphantutrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Phân tử thứ " + i + " trong mảng là");
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhập a");
        int a = scanner.nextInt();
        System.out.println("Vị trí của a cần xóa trong mảng la: "+timVitri(arr,a));
        //Xóa phần tử
        int vitricanxoa = timVitri(arr,a);
        int [] Arr = new int[arr.length-1];
        for (int i = 0; i < vitricanxoa; i++) {
                Arr[i]=arr[i];
        }
        for (int i = vitricanxoa; i < arr.length-1; i++) {
                Arr[i]=arr[i+1];
        }
        arr=Arr;
        inMang(arr);
        //Thêm phần tử trong mảng
        System.out.println("nhập b");
        int b = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm");
        int vitrithem = scanner.nextInt();
        int [] crr = new int[arr.length+1];
        for (int i = 0; i < crr.length; i++) {
            if (i<vitrithem){
                crr[i]=arr[i];
            }
           if (i==vitrithem){
               crr[vitrithem]=b;
           }
            if (i>vitrithem){
                crr[i]=arr[i-1];
            }
        }
        inMang(crr);

        }

    static int timVitri(int[] ar, int a) {
        int vitri = -1;
        for (int i = 0; i < ar.length; i++) {
            if (a == ar[i]) {
                vitri = i;
            }
        }return vitri;
    }
    static void inMang(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }

}
