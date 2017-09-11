package lesson16.lesson17_hw;

/**
 * Created by DT on 02.07.2017.
 */
public class Solution3_from_Andrey {
    public static void main(String[] args) {
        String res = "Напишите метод! countWords, для слов во входящем стринге.";
        System.out.println(countWords(res));
    }
    public static int countWords(String input){
        String[]words = input.split(" ");
        int count = 0;
        for(String word:words){
            if(word.length()>0&&checkLetter(word))
                count++;
        }
        return count;
    }
    public static boolean checkLetter(String name){
        char[] chars = name.toCharArray();
        for(char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}
