package lesson18_hw1;

import java.util.Arrays;

/**
 * Created by dereban on 02.08.2017.
 */
public class Solution {
    public static void main (String[] args) {
        String str = "p (26)   gbfdg 104 293 101 144 34  28  160 180";


        System.out.println(Arrays.toString(findNumbers(str)));
    }
    public static int[] findNumbers(String text){
        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Integer.valueOf(array[i]);
        }
        return a;
    }
}
