
package lesson19.lesson19_hw;

/**
 * Created by dereban on 10.08.2017.
 */
public class Controller{
   //File[] files = new File[100];
//    Storage[] chranilishe = new Storage[100];

    public File put(Storage storage, File file) throws Exception{


        for(File files : storage.getFiles()){
            if(validate(storage, files))
               return file;
        }
        throw new Exception("File is in storage with such " + file.getName());
    }


    public void delete(Storage storage, File file){

        for(File files : storage.getFiles()) {
            try {
                if(validate(storage, files)) {
                   delete(storage, file);
                }
                    return ;
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo){

    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id){

    }

    private void checkForSize(Storage storage, long fileSize) throws Exception{
        long usedSize = 0;
        for(File file : storage.getFiles()) {
            if(file != null)
                usedSize += file.getSize();
        }
        if(usedSize + fileSize > storage.getStorageSize())
            throw new Exception("No free space in storage " + storage.getId());
    }
    private boolean validate(Storage storage, File file)throws Exception{
        findById(storage,file.getId());
        checkFormat(storage,file.getFormat());
        checkForFreePlace(storage);
        checkForSize(storage,file.getSize());

        return false;
    }

    private void checkForFreePlace(Storage storage) throws Exception{
        for(File file : storage.getFiles()) {
            if(file == null)
                return;
        }
        throw new Exception("No free place in storage " + storage.getId());
    }

    private void checkForFreePlace(Storage storage, int placesNeeded) throws Exception{
        int count = 0;
        for(File file : storage.getFiles()) {
            if(file == null)
                count++;
        }
        if(count < placesNeeded)
            throw new Exception("No free place in storage " + storage.getId());
    }

    private void checkFormat(Storage storage, String fileFormat) throws Exception{
        for(String format : storage.getFormatsSupported()) {
            if(format.equals(fileFormat))
                return;
        }
        throw new Exception(fileFormat + " is not supported in storage" + storage.getId());
    }
    private File findById(Storage storage,long id) throws Exception{
        for(File file : storage.getFiles()){
            if(file != null && file.getId()==id)
                throw new Exception("File " + id + "already exist in storage " + storage.getId());
        }
        return null;
    }


}



