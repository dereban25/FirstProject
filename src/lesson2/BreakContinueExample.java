package lesson2;

/**
 * Created by dereban on 23.03.2017.
 */
public class BreakContinueExample {
    public static void main(String[] args) {
        int test = 10;

        while (test >0){
            System.out.println(test);
            System.out.println("...");
            test--;
            break;
        }

        System.out.println("done");
    }
}
