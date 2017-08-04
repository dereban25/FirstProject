package lesson10.lesson10_hw1;


import java.util.Date;

/**
 * Created by dereban on 13.06.2017.
 */
public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder ( String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths ) {
        super ( itemName, dateCreated, shipToCity, basePrice, customerOwned );
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder () {
        String[] cityFrom = {"Киев","Одесса","Днепр","Харьков"};
        String[] cityTo = {"Киев","Одесса","Днепр","Харьков"};
        boolean cityCheck = false;

        for(int i =0;i<cityFrom.length;i++){
            if(getCustomerOwned().getCity().equals(cityFrom[i])){
                for(int k=0;k<cityTo.length;k++){
                    if(getShipToCity().equals(cityTo[k])){
                        cityCheck = true;
                    }
                }
            }
        }
        if(cityCheck==true && getBasePrice ()>100 && getCustomerOwned ().getGender ()=="Женский"){
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice () {

        double comission = 0.15;
        if (getShipToCity().equals("Киев")||getShipToCity().equals("Одесса")){
            comission = 0.10;
        }
        setTotalPrice(getBasePrice()+(getBasePrice()*comission));
        if(getTotalPrice()>1000){
            setTotalPrice(getTotalPrice()-(getTotalPrice ()*0.05));
        }

    }
}

