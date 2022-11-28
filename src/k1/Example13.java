package k1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int a = in.nextInt();

        System.out.println("Введите число");
        int b = in.nextInt();

        int result = a + b;

        System.out.println(result);
    }
}
