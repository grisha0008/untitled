package lr3;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели");
        String day = in.nextLine();

        switch (day){
            case "Понедельник":
                System.out.println("1");
                break;
            case "Вторник":
                System.out.println("2");
                break;
            case "Среда":
                System.out.println("3");
                break;
            case "Четверг":
                System.out.println("4");
                break;
            case "Пятница":
                System.out.println("5");
            case "Суббота":
                System.out.println("6");
            case "Воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Введите правильно день недели");
                break;
        }
    }
}
