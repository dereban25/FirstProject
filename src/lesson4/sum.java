package lesson4;


/**
 * Created by dereban on 03.04.2017.
 */
public class sum {

    public static void main ( String[] args ) {
        System.out.println ( compareSums ( 10, 15, 234, 12 ) );


    }

    public static boolean compareSums ( int a, int b, int c, int d ) {
        return sum(a, b) > sum(c, d);
    }

        public static long sum ( int from, int to) {


        long test1 = 0;
        for(long i = from; i <= to;i++){
            test1+=i;
        }


            return test1;
        }
}