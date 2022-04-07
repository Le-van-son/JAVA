
public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 9};
        int[] arr2 = {1, 3, 5, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, 5, arr2.length);

        inMang(arr3);

    }
    static void inMang ( int[] arr){
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
