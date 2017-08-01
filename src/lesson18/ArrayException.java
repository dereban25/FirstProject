package lesson18;

/**
 * Created by dereban on 01.08.2017.
 */
public class ArrayException {
    public static void main (String[] args) {
        int[] array ={1,5,0};
        try{
            System.out.println(array[3]);
        } catch(Exception e){
            System.err.println("element was not found");
        }
        System.out.println("cool.....");
        System.out.println("cool2.....");

    }
}
