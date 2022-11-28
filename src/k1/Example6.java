package k1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию");
        String name2 = in.nextLine();

        System.out.println("Введите имя");
        String name1 = in.nextLine();

        System.out.println("Введите отчество");
        String name3 = in.nextLine();

        System.out.println("Hello word " + name2 + " " + name1 + " " + name3);

    }
}
