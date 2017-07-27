package lesson17_hw;

/**
 * Created by DT on 01.07.2017.
 */
public class Solution {
    public static void main (String[] args) {
        String count = "Мой сын и моя жена самые лучшие? как ты";
        System.out.println(countWords(count));

    }

    public static int countWords (String input) {
        String[] words = input.split(" ");
        int count = 0;
        int wordsSize = words.length;
        for(int i = 0; i < wordsSize; i++)
            if(words[i] != null && !"".equals(words[i]))
                count++;
        return count;
    }

}