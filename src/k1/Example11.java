package k1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = in.nextLine();

        System.out.println("Введите год рождения ");
        int date = in.nextInt();

        int now_date = 2022;

        System.out.println(name);
        System.out.println(now_date - date + "Года");
    }
}
