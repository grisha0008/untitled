package k1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ведите название месяца");
        String month = in.nextLine();

        System.out.println("Введите кол-во дней в этом месяце");
        String day = in.nextLine();

        System.out.println(month + " " + day + " День");
    }
}
