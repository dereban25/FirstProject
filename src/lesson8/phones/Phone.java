package lesson8.phones;

/**
 * Created by dereban on 17.05.2017.
 */
public class Phone {
    int price;
    double weight;
    String countryProduced;

    public Phone( int price, double weight, String countryProduced ) {
        System.out.println ("Phone constructor was invoked...");
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;
    }

    void orderPhone(){
        System.out.println ("order phone invoked...");

    }
}
