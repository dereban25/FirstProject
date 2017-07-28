package lesson17_hw2;

/**
 * Created by DT on 02.07.2017.
 */
public class Solution {

    public static String maxWord (String input) {
        String[] words = input.split(" ");
        if(words.length == 0)
            return null;
        String maxWord = null;

        for(String word : words) {
            if(word.length() > 0 && checkLetter(word)){
                maxWord = word;
                break;
            }

        }
        if(maxWord == null)
            return null;
        for(String word : words) {
            if(word.length() > maxWord.length() && checkLetter(word))
                maxWord = word;
        }
        return maxWord;
    }

    public static String minWord (String input) {
        String[] words = input.split(" ");
        if(words.length == 0)
            return null;
        String minWord = null;
        for(String word : words) {
            if(word.length() > 0 && checkLetter(word)){
                minWord = word;
                break;
            }
        }
        if(minWord == null)
            return null;
        for(String word : words) {
            if(word.length() < minWord.length() && word.length() > 0 && checkLetter(word))
                minWord = word;
        }
        return minWord;
    }

    public static boolean checkLetter (String name) {
        char[] chars = name.toCharArray();
        for(char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}


