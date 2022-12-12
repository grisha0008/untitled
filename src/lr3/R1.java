package lr3;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1-7");
        String day = in.nextLine();

        switch (day){
            case "1" -> System.out.println("Понедельник");
            case "2" -> System.out.println("Вторник");
            case "3" -> System.out.println("Среда");
            case "4" -> System.out.println("Четверг");
            case "5" -> System.out.println("Пятница");
            case "6" -> System.out.println("Суббота");
            case "7" -> System.out.println("Воскресенье");
            default -> System.out.println("Число выше или ниже 1-7");
        }
    }
}
