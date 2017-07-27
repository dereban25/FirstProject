package lesson8.phones;

/**
 * Created by dereban on 17.05.2017.
 */
public class Android extends Phone{
    String androidVersion;
    int screenSize;
    String secretDeviceCode;

    public Android ( int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviceCode ) {
        super(price,weight,countryProduced);
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }


    void installNewAndroidVersion(){
        System.out.println ("installNewAndroidVersion invoked...");
    }
}
