package lesson10_hw1;

import java.util.Date;

/**
 * Created by dereban on 11.06.2017.
 */
public abstract class Order {

    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed;
    private Date dateShipped;
    private String shipToCity;
    private int basePrice;
    private double totalPrice;
    private Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    abstract void validateOrder();

    abstract void calculatePrice();

     void confirmShipping() {
        
            dateShipped = new Date();
         
    }

    public String getItemName() {
        return itemName;
    }



    public Date getDateCreated() {
        return dateCreated;
    }



    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getShipToCity() {
        return shipToCity;
    }



    public int getBasePrice() {
        return basePrice;
    }



    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomerOwned () {
        return customerOwned;
    }


}

