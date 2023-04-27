package test14;

import java.util.Scanner;

public class InputUtil {
    public static String inputString(String title) {
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        return input.nextLine();
    }
}
