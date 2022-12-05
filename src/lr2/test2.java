package lr2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int a = in.nextInt();
        int b = a % 5;
        int c = a % 7;

        if (b == 2 && c == 1){
            System.out.println("Все требования выполнены");
        }
        else if (b == 2 && c != 1){
            System.out.println("Все верно кроме одного");
        }
        else if (b != 2 && c == 1){
            System.out.println("Все верно кроме одного");
        }
        else System.out.println("Не удовлетворяет ни одному");

        in.close();


    }
}
