package lesson19.lesson19_hw;

/**
 * Created by dereban on 10.08.2017.
 */
public class Controller{
   // File[] files = new File[100];
//    Storage[] chranilishe = new Storage[100];

    public void put(Storage storage, File file){
        File[] storages =storage.getFiles();
        File[] files = new File[50];
        try {
            int a = 0;
            for(File storage1:storages)
            for(File fi : files) {
                if(fi == null&&storage1==null) {
                    files[a] = file;
                    break;
                }
                a++;
            }

        } catch(NullPointerException e) {
            System.out.println("We have mistakes" + e);
        }
    }

    public void delete(Storage storage, File file){
       // Storage[] storages = new Storage[50];
        File[] files = new File[50];
        try {
            int a = 0;
            for(File check : files) {
                if(check.equals(files)) {
                    files[a] = null;
                    break;
                }
                a++;
            }
        } catch(NullPointerException e) {
            System.out.println("We have mistakes" + e);
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo){

    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id){

    }


}
