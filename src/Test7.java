public class Test7 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};
        for (int i=0; i< arr.length;i++){
            for (int j=0; j< arr.length; j++){
                if (i==j)

                    System.out.println(arr[i][j]);
                }

            }
        }
    }

