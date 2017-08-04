package lesson18.lesson18_hw1;

import java.util.Arrays;

/**
 * Created by dereban on 02.08.2017.
 */
public class Solution {
    public static void main (String[] args) {
        String str = "p  most";

        System.out.println(Arrays.toString(findNumbers(str)));
    }

    public static int[] findNumbers (String text) {
        int[]a = new int[0];
        try {
            String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
           a = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                a[i] = Integer.valueOf(array[i]);
            }

        } catch(Exception e) {

            System.out.println("not a number " +e);
        }

        return a;
    }
}


