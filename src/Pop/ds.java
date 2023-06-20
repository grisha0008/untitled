package Pop;

import java.util.Scanner;

public class ds {
    public static void main(String[] args) {
        int[] lol = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < lol.length; i++){
            System.out.println("Введите число");
            int value = scanner.nextInt();
            lol[i] = value;

        }

    }
}
