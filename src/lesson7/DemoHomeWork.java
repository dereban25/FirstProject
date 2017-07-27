package lesson7;



import lesson6.Order;

import java.util.Date;

/**
 * Created by dereban on 12.05.2017.
 */
public class DemoHomeWork {
    public static void main (String[] args) {
        Order order3 = new Order(1500,new Date(),true,new Date(),"Dnepr","Ukraine","Value");
        System.out.println(order3.checkPrice());
        System.out.println(order3.isValidType());
        Order order4 = new Order(1000,new Date(),true,new Date(),"Dnepr","Ukraine","Buy");
        System.out.println(order4.checkPrice());
        System.out.println(order4.isValidType());
    }


    public Order createOrder(){
        Order order1 = new Order (  );
        return order1;

    }
    public  Order createOrderAndCallMethods(){
        Order order2=new Order ( 100,new Date (  ),true,new Date (  ),"Kiev","Ukraine","SomeValue" );
        order2.isValidType();
        order2.checkPrice();
        //order2.confirmOrder();

        return order2;
    }
}
