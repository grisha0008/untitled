package LR9_2023;

public class EX6 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {//Переставил потомка выше предка
            System.out.println("3");
        }
        catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("4");
    }
}
