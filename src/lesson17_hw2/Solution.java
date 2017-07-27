package lesson17_hw2;

/**
 * Created by DT on 02.07.2017.
 */
public class Solution {
	public static void main (String[] args) {
		String test="you35 mytr35 der der ffffffffff";

		System.out.println(maxWord(test));
		System.out.println(minWord(test));

	}
	public static String maxWord (String input) {
		String[] words = input.trim().split(" ");
		// String maxLen=words[0];
		String maxWord = "";
		for (int i = 0; i < words.length; i++) {
			if (checkLetter(words[i]) == true) {
				maxWord = words[i];
				//System.out.println(maxWord);
				break;
			}
		}

		int i =0;
		for(String word:words){
			if(maxWord.length()<word.length()&&checkLetter(word))
				maxWord = word;
			i++;

		}

		return maxWord;
	}
	public static String minWord (String input){
		String[] words = input.trim().split(" ");
		// String minLen=words[0];
		String minWord = "";
		for (int i = 0; i < words.length; i++) {
			if (checkWithoutSpecSymbol(words[i])==true) {
				minWord = words[i];
				//System.out.println(maxWord);
				break;
			}
		}
		int i = 0;
		for(String word:words){
			if(minWord.length()>word.length()&&checkLetter(word))
				minWord = word;
			i++;

		}


		return minWord;
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

public static int checkWithoutSpecSymbol(String input){
		String[]words=input.split(" ");
		int count = 0;
	for (String word : words) {
		if (word.matches("^[а-яА-ЯёЁa-zA-Z]+$"))
			count++;
	}
	return count;
}
}


