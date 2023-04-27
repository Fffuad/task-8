public class Test3 {
    public static void main(String[] args) {
        int [] arr = {11,20,54,40,60,87};
        for(int i = 0; i<arr.length;i++){
            if (arr[i]%4==0 && arr[i]%5==0){
                System.out.println(arr[i]);
            }

        }
    }
}
