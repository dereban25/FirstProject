package lesson16.lesson17_hw3;

/**
 * Created by dereban on 12.07.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(validate("www.dereban.ua"));
        System.out.println(validate("http://dereban.com"));
    }
    public static boolean validate(String address){
        if(!address.startsWith("http://")&& !address.startsWith("https://"))
            return false;
       address=address.replace("http://","");
        address=address.replace("https://","");
        address=address.replace("www.","");
        if(!address.contains(".net")&&!address.contains(".com")&&!address.contains(".org"))
            return false;
       address=address.replace(".net","");
        address=address.replace(".com","");
        address=address.replace(".org","");
        return checkLetterOrNumber(address);
    }
    public static boolean checkLetterOrNumber(String name){
        char[] chars = name.toCharArray();
        for(char c : chars){
            if(!Character.isLetter(c)&& !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
