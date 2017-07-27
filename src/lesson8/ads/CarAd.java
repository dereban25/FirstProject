package lesson8.ads;

/**
 * Created by dereban on 19.05.2017.
 */
public class CarAd extends Ad{
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd ( long id, int price ) {
        super ( id, price );
    }

    void confirmAd(){
        //some Logic
    }
}
