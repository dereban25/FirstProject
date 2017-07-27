package lesson5;


import java.util.Arrays;



/**
 * Created by dereban on 10.04.2017.
 */
public class ArraysSort {
    public static void main ( String[] args ) {
        int[] array = {25, 0, 12, 15, 10, 5};

        System.out.println ( Arrays.toString ( sortAscending ( array ) ) );
        System.out.println ( Arrays.toString ( sortDescending ( array ) ) );
    }

    public static int[] sortAscending ( int[] array ) {

        Arrays.sort ( array );


        return array;
    }

    public static int[] sortDescending ( int[] array ) {
       int [] result = new int [array.length];


       for (int i = 0, j = result.length - 1; i < array.length; i++, j--){
           result[j] = array[i];



        }
        return result;
    }
}





