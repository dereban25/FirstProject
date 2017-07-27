package lesson8.ads;

import java.util.Date;

/**
 * Created by dereban on 19.05.2017.
 */
public class Ad extends BaseEntity{

    Date dateCreated;
    int price;

    public Ad (long id,int price) {
        super(id);
        this.dateCreated = new Date (  );
        this.price = price;
    }

    void publishAd(){
        //some logic
    }
}
