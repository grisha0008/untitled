package times2;


import java.util.Locale;
import java.util.Scanner;

public class Task1264 {

    static Scanner input = new Scanner(System.in);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        System.out.println(input.nextInt() * (input.nextInt() + 1));
    }
}