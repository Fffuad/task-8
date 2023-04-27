import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = {11, 92, 38, 94, 51, 62, 17, 98, 49,};
        int n = scanner.nextInt();
        for (int i = 0; i < arr.length; i++)
            if (n == arr[i]) {
                System.out.println(i);
            }
    }
}
