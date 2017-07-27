package lesson5;

/**
 * Created by dereban on 12.04.2017.
 */
public class ArraysOrder {


    public static void main( String[] args){
            int[] values = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 7 };
            System.out.println (  uniqueCount (values) );

        }

        public static int uniqueCount( int[] values) {
            boolean mask[] = new boolean[values.length];
            int removeCount = 0;

            for (int i = 0; i < values.length; i++) {
                if (!mask[i]) {
                    int tmp = values[i];

                    for (int j = i + 1; j < values.length; j++) {
                        if (tmp == values[j]) {
                            mask[j] = true;
                            removeCount++;
                        }
                    }
                }
            }

            int[] result = new int[values.length - removeCount];

            for (int i = 0, j = 0; i < values.length; i++) {
                if (!mask[i]) {
                    result[j++] = values[i];
                }
            }
            return result.length;
        }



    }




