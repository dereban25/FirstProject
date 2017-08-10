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
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFormat(){
        return format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public long getSize(){
        return size;
    }

    public void setSize(long size){
        this.size = size;
    }
}
