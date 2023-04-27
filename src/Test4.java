import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin ölçüsünü təyin edin:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Massivin dəyərlərini daxil edin:  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Massivin dəyərləri:  ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("Kvadratlari:  ");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(Math.pow(arr[i],2 ));

        }
    }
}
