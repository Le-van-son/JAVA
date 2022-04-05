
public class GopMang {
    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8};
        int [] arr2 ={1,3,5,7};
        int [] arr3 = new int[8];
        for (int i = 0; i < 4; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 4; i < 8; i++) {
            arr3[i]=arr2[i-4];
        }
        inMang(arr3);
    }
    static void inMang(int []mang){
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }
    }
}
