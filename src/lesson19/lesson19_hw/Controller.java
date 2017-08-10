package lesson19.lesson19_hw;

/**
 * Created by dereban on 10.08.2017.
 */
public class Controller{
    File[] files = new File[100];
    Storage[] chranilishe = new Storage[100];

    public File put(Storage storage, File file){
        if(file == null)
            return null;
        int a = 0;
        for(Storage fileSave : chranilishe)
        for(File file1 : files) {
            if(file1 == null)
            if(fileSave==null){
                files[a] = file;
                break;
            }
            a++;
        }
        return file;
    }
    public void delete(Storage storage, File file){
        int index = 0;
        for(Storage fileSave : chranilishe)
            for(File file1 : files){
            if (file1.equals(file)&&fileSave.equals(file)){
                files[index] = null;
                break;
            }
            index++;
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo){

    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id){

    }

    public Storage checkFiles(String[] formatsSupported, long storageSize, long id, String name){

        for(Storage file : chranilishe)
            for(File file1 : files) {
                if(file.getFormatsSupported() == new String[]{"exe", "txt", "doc"})
                    if(!file.equals(id) && file1.equals(name) && file1.getName().length() < 10)
                        if(file.getStorageSize() <= 500000) {
                            return file;
                        }
            }
        return null;
    }
}
