
package lesson19.lesson19_hw;

/**
 * Created by dereban on 10.08.2017.
 */
public class Controller{
   /// File[] files = new File[100];
//    Storage[] chranilishe = new Storage[100];

    public File put(Storage storage, File file) throws Exception{
        validate(storage, file);
        int index=0;
        for(File files : storage.getFiles()) {
            if(files==null){
                storage.getFiles()[index]=file;
                break;
            }
                index++;
        }
       return storage.getFiles()[index];
    }


    public void delete(Storage storage, File file) throws Exception{

     boolean isExist=false;
     for(File fl:storage.getFiles()){
         if(fl!=null && fl.equals(file)){
             isExist = true;
             break;
         }
     }
     if(!isExist)
         throw new Exception("File does not exist in storage "+ storage.getId()+".Cant be deleted");
        int index = 0;
        for(File fl:storage.getFiles()){
            if(fl!=null && fl.equals(file)){
                storage.getFiles()[index]=null;
            }
            index++;
        }
    }


    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception{
        long sizeOfFilesFromStorage=0;
        for(File fileFromStorage:storageFrom.getFiles()){
            findById(storageTo,fileFromStorage.getId());
            checkFormat(storageTo,fileFromStorage.getFormat());
            sizeOfFilesFromStorage+=fileFromStorage.getSize();
        }
        checkForFreePlace(storageTo,storageFrom.getFiles().length);
        checkForSize(storageTo,sizeOfFilesFromStorage);
        for(File fileFromStorage:storageFrom.getFiles()){
            if(fileFromStorage!=null){
                delete(storageFrom,fileFromStorage);
                put(storageTo,fileFromStorage);
            }
        }

    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception{
        for(File fileFromStorage:storageFrom.getFiles()){
            if(fileFromStorage.getId()==id){
                put(storageTo,fileFromStorage);
                return;
            }
        }

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

    private boolean validate(Storage storage, File file) throws Exception{
        findById(storage, file.getId());
        checkFormat(storage, file.getFormat());
        checkForFreePlace(storage);
        checkForSize(storage, file.getSize());

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

    private File findById(Storage storage, long id) throws Exception{
        for(File file : storage.getFiles()) {
            if(file != null && file.getId() == id)
                throw new Exception("File " + id + "already exist in storage " + storage.getId());
        }
        return null;
    }


}



