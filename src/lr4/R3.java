package lr4;

import java.util.Scanner;

public class R3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника ");
        int ligh = in.nextInt();

        System.out.print("Введите ширину прямоугольника ");
        int shir = in.nextInt();

        int[][] array = new int[ligh][shir];

        int o = 0;

        for (int i = 0; i < ligh; i++) {
            for ( int j = 0; j < shir; j++){
                array[ligh][shir] = 2;
            }
        }
        for (int i = 0 ; i < shir ; i++){
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < ligh;j++){
                System.out.print(array[i][j]+" ");
                o++;
            }
            System.out.println(" Количество символов в строке " + o);
            o = 0;
        }


    }
}
