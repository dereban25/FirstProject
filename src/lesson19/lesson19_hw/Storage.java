package lesson19.lesson19_hw;

/**
 * Created by dereban on 10.08.2017.
 */
public class Storage{
    private long id;
    private File[] files;
    private String[] formatsSupported;
    private String storageCountry;
    private long storageSize;

    public Storage(long id, File[] files, String[] formatsSupported, String storageCountry, long storageSize){
        this.id = id;
        this.files = files;
        this.formatsSupported = formatsSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
    }

    public long getId(){
        return id;
    }

    public String[] getFormatsSupported(){
        return formatsSupported;
    }

    public long getStorageSize(){
        return storageSize;
    }


}
