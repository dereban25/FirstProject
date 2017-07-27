package lesson8.phones;

/**
 * Created by dereban on 17.05.2017.
 */
public class IPhone extends Phone{

    boolean fingerPrint;

    public IPhone ( int price, double weight, String countryProduced, boolean fingerPrint ) {
        super(price,weight,countryProduced);
        System.out.println ("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }



    void deleteIphoneFromDb(){
        System.out.println ("deleteIphoneFromDb invoked...");

    }
}
