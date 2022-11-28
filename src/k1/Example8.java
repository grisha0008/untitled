package k1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер дня недели? ");
        int day = in.nextInt();

        System.out.println("Введите номер месяца? ");
        int month = in.nextInt();

        System.out.println("Введите номер дня в месяца ");
        int day_month = in.nextInt();
        if (day_month < 31) System.out.println("Неверное число");
        else System.out.print(day_month);

        if (month == 1) System.out.print("Январь ");
        else if (month == 2) System.out.print("Февраль");
        else if (month == 3) System.out.print("Март");
        else if (month == 4) System.out.print("Апрель");
        else if (month == 5) System.out.print("Май");
        else if (month == 6) System.out.print("Июнь");
        else if (month == 7) System.out.print("Июль");
        else if (month == 8) System.out.print("Август");
        else if (month == 9) System.out.print("Сентябрь");
        else if (month == 10) System.out.print(" Октябрь ");
        else if (month == 11) System.out.print(" Ноябрь ");
        else if (month == 12) System.out.print(" Декабрь ");
        else System.out.println("Неверный формат");

        if (day == 1) System.out.print("Понедельник ");
        else if (day == 2) System.out.print("Вторник ");
        else if (day == 3) System.out.print("Среда ");
        else if (day == 4) System.out.print("Четверг ");
        else if (day == 5) System.out.print("Пятница ");
        else if (day == 6) System.out.print("Суббота ");
        else if (day == 7) System.out.print("Воскресенье ");
        else System.out.println("Неверный формат");

        in.close();
    }
}
