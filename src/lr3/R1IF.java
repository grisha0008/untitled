package lr3;

import java.util.Scanner;

public class R1IF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели от 1-7");
        int day = in.nextInt();

        if (day == 1)
            System.out.println("Понедельник");
        else if (day == 2)
            System.out.println("Вторник");
        else if (day == 3)
            System.out.println("Среда");
        else if (day == 4)
            System.out.println("Четверг");
        else if (day == 5)
            System.out.println("Пятница");
        else if (day == 6)
            System.out.println("Суббота");
        else if (day == 7)
            System.out.println("Воскресенье");
        else
            System.out.println("Ошибка");
    }
}
