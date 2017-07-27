package lesson2;

/**
 * Created by dereban on 24.03.2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 1;
        int sum = 1;
        while (n <= 1000) {
            sum += n;
            n++;
            int div = sum / 1234;
            int mod = sum % 1234;

            boolean res = div < mod;

            System.out.println(res);

        }
    }

}