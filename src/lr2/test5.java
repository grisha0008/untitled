package lr2;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число ");
        int a = in.nextInt();

        System.out.println("Количество тысяч в числе " + (a/1000)%10);

    }
}



//5. Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном
//представлении числа).