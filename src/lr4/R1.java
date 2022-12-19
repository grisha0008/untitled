package lr4;

public class R1 {
    public static void main(String[] args) {

        int figure = 11;
        int i;
        int j;
        int z;

        for(i=1;i <= figure;i++){
            System.out.print("Номер строки:"+ i + " ");
            z = 0;
            for (j = 0; j < 23; j++) {
                System.out.print("+");
                z = z+1;
            }
            System.out.println("Кол-во символов в строке " + z);
        }
    }
}
