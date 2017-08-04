package lesson19;

/**
 * Created by dereban on 04.08.2017.
 */
public class ThrowExample{
    private static String[] array = {"tes","dereban","fsdf","fddsa",null};

    public static void main(String[] args){
        //test();
        useOftestMethod();
    }

    private static void test(){
        for(String element : array){
            if(element == null)
                throw new RuntimeException("null is detected");
        }
        System.out.println("Method is finished");
    }
    private static void useOftestMethod(){
        try{ test();
        }catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
