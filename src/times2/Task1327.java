package times2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class Task1327 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static final int nextInt() throws IOException {

        return Integer.parseInt(buffer.readLine());
    }
    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int a = nextInt();
        int b = nextInt();

        int result = ((b - a) >> 1);
        if ((a & 1) > 0 || (b & 1) > 0) {
            result++;
        }

        out.println(result);
        out.flush();
    }
}