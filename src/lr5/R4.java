package lr5;

public class R4 {
    public static void main(String[] args) {
        //   Scanner id = new Scanner(System.in);
        Example_4 myexample1 = new Example_4(12,'A');
        Example_4 myexample2 = new Example_4(65.1267);
    }
}
class Example_4{
    private char ch1;
    private int int1;
    Example_4(int i, char c){
        ch1 = c;
        int1 = i;
        int length = (int) (Math.log10(int1) + 1);
        double result = (double)ch1 + (double)int1*1/Math.pow(10, length);
        System.out.println("result1 = "+result+"; ch = "+(double)ch1+ "; int = "+length);
    }
    Example_4(double d){
        char ch1 = (char)d;
        int1 = (int)((d -(int)d)*100);
        System.out.println("ch = "+ch1+"; int = "+int1);
    }
}