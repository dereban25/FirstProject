package lesson18.lesson18_hw2;

import java.util.Arrays;

/**
 * Created by dereban on 02.08.2017.
 */
public class Solution {
    public static void main (String[] args) {
        String str = "p  gbfdg";


        findNumbers( str );
        System.out.println( Arrays.toString( findNumbers( str ) ) );
    }

    public static int[] findNumbers (String text) {
        String[] array = (text.replaceAll( "\\D+", " " ).trim()).split( " " );
        int[] a = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            a[i] = Integer.valueOf( array[i] );
            if(checkLetterOrNumber( String.valueOf( a ) ));{
                System.out.println("not number");
            }

        }
        return a;
    }
    public static boolean checkLetterOrNumber(String name) {
        char[] chars = name.toCharArray();
        for(char c : chars) {
            if(!Character.isDigit( c )) {
                return false;
        }
        }
        return true;
    }
    }




