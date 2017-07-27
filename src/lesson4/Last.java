package lesson4;

/**
 * Created by dereban on 05.04.2017.
 */
public class Last {
    public static void main(String[] args) {
        System.out.println(findDivCount((short)1, (short) 10,5));

    }

    private static int findDivCount ( short a, short b, int n ) {
        int count = 0;
        for  (int i = a; i<=b; i ++) {
            if (i % n == 0)
                count++;

            }

        return count;
    }


}





