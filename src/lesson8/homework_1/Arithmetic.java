package lesson8.homework_1;



/**
 * Created by dereban on 24.05.2017.
 */
public class Arithmetic {

    public static boolean check(int[] array) {
        int[] myElement = new int[ 5 ];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i = 0; i < myElement.length; i++) {
            max = Math.max(max, myElement[ i ]);
            min = Math.min(min, myElement[ i ]);
        }
        int b =(min + max);
        boolean c = b>100;
        return c;

    }
}



