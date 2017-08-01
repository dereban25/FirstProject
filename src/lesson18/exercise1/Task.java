package lesson18.exercise1;

/**
 * Created by dereban on 01.08.2017.
 */
public class Task {
    public static void main (String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1","test2"};
        fileStorage.setFiles(fileNames);
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println("Done");

        String[] fileNames1 = {"test1","test2","how are you","good day","good"};
        fileStorage.setFiles(fileNames1);
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println("Done");

        String[] fileNames2 = {"test1","test2","very","best","bad","bathroom"};
        fileStorage.setFiles(fileNames2);
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println("Done");
    }

    public static void printer(Storage storage){
      String[] names = storage.getFiles();
      try{
          System.out.println("5th name is " + names[4]);
      } catch(Exception e){
          System.out.println("5th name can not be found...");
         // System.err.println(e.getMessage());
      }

    }
}
