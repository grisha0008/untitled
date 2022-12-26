package lr4;

import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размеры");
        int r = in.nextInt();

        char [][] grath = new char[r][];
        for (int i = 0; i < grath.length;i++){
            int j = i+1;
            grath[i]=new char[j];
        }
        int z = 0;
        for (int i =0; i < r; i++){
            for (int j = 0; j <i+1; j++){
                grath[i][j] = '@';
            }
        }
        for (int i =0; i < r; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < grath[i].length; j++){
                System.out.print(grath[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
