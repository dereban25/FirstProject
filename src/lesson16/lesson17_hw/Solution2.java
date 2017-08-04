package lesson16.lesson17_hw;

/**
 * Created by DT on 02.07.2017.
 */
public class Solution2 {



        public static void main(String[] args) {
            String res = "Напишите метод! countWords для слов во входящем стринге.";
            System.out.println(countWords(res));
        }

        private static int countWords(String input) {
            if(input.isEmpty())  return 0;
            int count = 0;
            String string =input.replaceAll("\\pP", "");
            String[] words = input.split(" ");
            for (String word : words) {
                if (word.matches("^[а-яА-ЯёЁa-zA-Z]+$"))
                    count++;
            }
            return count;
        }
    }

