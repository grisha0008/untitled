package times2;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task1299 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        out.println(input.nextInt() * input.nextInt() * input.nextInt() << 1);
        out.flush();
    }
}
