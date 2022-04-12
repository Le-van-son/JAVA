package testinmang;

public class InMang {
    private int [] arr={2,4,6};

    public void setArr(int[] arr){
        this.arr =arr;
    }

    public void getArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
    }

    public static void main(String[] args) {
        InMang in = new InMang();
        in.getArr();
    }
}
