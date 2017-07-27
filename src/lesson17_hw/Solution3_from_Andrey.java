package lesson17_hw;

/**
 * Created by DT on 02.07.2017.
 */
public class Solution3_from_Andrey {
    public  int countWords(String input){
        String[]words = input.split(" ");
        int count = 0;
        for(String word:words){
            if(word.length()>0&&checkLetter(word))
                count++;
        }
        return count;
    }
    public boolean checkLetter(String name){
        char[] chars = name.toCharArray();
        for(char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}
