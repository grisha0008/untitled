package LR7.R1;

public class lb_01 {
    public static void main(String[] args) {
        superClassTest superClassObject = new superClassTest("передно в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        subClassTest subClassObject1 = new subClassTest("передано в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClassTest subClassObject2 = new subClassTest("передано в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}