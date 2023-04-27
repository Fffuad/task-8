public class Test5 {
    public static void main(String[] args) {
        int[][] arr = {{10, 23, 39}, {41, 50, 65}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                if (arr[i][j] % 5 == 0 ) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }
}
