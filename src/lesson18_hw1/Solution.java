package lesson18_hw1;

import java.util.Arrays;

/**
 * Created by dereban on 02.08.2017.
 */
public class Solution {
    public static void main (String[] args) {
        String str = "p   gbfdg ";


        System.out.println(Arrays.toString(findNumbers(str)));
    }
    public static int[] findNumbers(String text){
       try{ String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Integer.valueOf(array[i]);
        }
        return a;
    }catch(Exception e){
           String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
           int[] a = new int[array.length];
           for (int i = 0; i < array.length; i++) {
              // boolean b = Integer.valueOf(array[i])== a[i];
           }
           System.out.println("not a number");
       }
        return new int[0];
    }
}
