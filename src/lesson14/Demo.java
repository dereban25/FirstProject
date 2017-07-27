package lesson14;

/**
 * Created by DT on 24.06.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Object objectTest = new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());

        objectTest = new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());

        objectTest = new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());
    }
}
