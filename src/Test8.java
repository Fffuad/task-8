public class Test8 {
    public static void main(String[] args) {
        int [][] arr ={{134,34,57},{81,87,25},{241,98,32}};
        for (int i =0;i<arr.length;i++){
            for (int j=0; j< arr.length;j++){
                if (j==2){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
