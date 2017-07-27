package lesson11.firstinterface;

/**
 * Created by dereban on 16.06.2017.
 */
public class TestClass implements FirstInterface {
    private int test = 10;

    @Override
    public void send () {

    }

    @Override
    public String receive () {
        return null;
    }
}
