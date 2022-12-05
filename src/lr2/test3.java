package lr2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int a = in.nextInt();

        if (a % 4 == 0 && a > 10)
            System.out.println("Число подходит");
        else
            System.out.println("Ошибка");
    }
}

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10.