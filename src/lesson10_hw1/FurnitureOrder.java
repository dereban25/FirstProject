package lesson10_hw1;

import java.util.Date;

/**
 * Created by dereban on 13.06.2017.
 */
public class FurnitureOrder extends Order{
    private String furnitureCode;


    public FurnitureOrder ( String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode ) {
        super ( itemName, dateCreated, shipToCity, basePrice, customerOwned );
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder () {
        String[] validateTown = {"Киев","Львов"};
        for(int i =0;i<validateTown.length;i++){
            if(validateTown[i]==getCustomerOwned().getCity()&& getBasePrice()>500 && getCustomerOwned().getName()!="Тест"){
                setDateConfirmed(new Date());
            }
        }
        if((getCustomerOwned().getCity()=="Киев"|| getCustomerOwned().getCity()=="Львов")&& getBasePrice()>500&& getCustomerOwned().getName()!="Тест"){
            setDateConfirmed(new Date());
        }

    }

    @Override
    public void calculatePrice () {
         double totalPrice;
         if(getBasePrice ()<5000){
             totalPrice = +getBasePrice() + (getBasePrice()*0.05);
         }
         else{
             totalPrice = +getBasePrice()+(getBasePrice()*0.02);
         }
         setTotalPrice(totalPrice);

    }
}
