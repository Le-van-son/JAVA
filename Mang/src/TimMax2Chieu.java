public class TimMax2Chieu {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max mảng là: " + max);
    }
}
