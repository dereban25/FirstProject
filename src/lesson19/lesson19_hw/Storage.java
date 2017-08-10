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

    public Storage(long id, File[] files){
        this.id = id;
        this.files = files;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
}
