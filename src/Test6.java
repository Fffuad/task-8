public class Test6 {
    public static void main(String[] args) {
        int[][] arr = {{21, 13, 56}, {9, 52, 68}};
        int plus=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length + 1; j++) {

                plus = plus + arr[i][j];
            }
        }    System.out.println(plus);


    }
}
