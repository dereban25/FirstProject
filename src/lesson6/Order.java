package lesson6;

import java.util.Date;

/**
 * Created by dereban on 10.05.2017.
 */
public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;



    public Order ( int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type ) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order () {
            }
   // Order order1 = new Order ( 100,new Date (  ),false,null,"Dnepr","Ukraine","Buy" );
     void confirmOrder (){

         isConfirmed = true;
        dateConfirmed = new Date ();
    }
     public boolean checkPrice(){
        if(price > 1000)
        return true;

        return false;
    }


    public boolean isValidType( ){

       if(type == "Buy"||type=="Sale")
        return true;
       return false;
    }


}
