package lesson19.lesson19_hw;

/**
 * Created by dereban on 10.08.2017.
 */
public class File{
    private long id;
    private String name;
    private String format;
    private long size;

    public File(long id, String name, String format, long size){
        this.id = id;
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
