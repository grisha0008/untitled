package lr2;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int a = in.nextInt();

        if (a >= 5 && a <= 10){
            System.out.println(a);
        }
        else
            System.out.println("Ошибка");
    }
}

