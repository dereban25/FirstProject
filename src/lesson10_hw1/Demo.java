package lesson10_hw1;

import java.util.Date;

/**
 * Created by dereban on 13.06.2017.
 */
public class Demo {
    public static void main ( String[] args ) {
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder ("Ноутбук",new Date (),"Днепр",15000,new Customer ("Надя","Киев","Женский"),25);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("Барабан",new Date(),"Одесса",100,new Customer("Петя","Киев","Мужской"),12);


        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Шкаф",new Date() , "Одесса", 7000, new Customer("Тест", "Днепр", "Женский"),"Ш1425/25");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Кухонный гарнитур",new Date() , "Днепр", 4000, new Customer("Василиса", "Львов", "Женский"),"К153/4");

        electronicsOrder1.calculatePrice();
        electronicsOrder1.validateOrder();
        electronicsOrder1.confirmShipping();

        electronicsOrder2.calculatePrice();
        electronicsOrder2.validateOrder();
        electronicsOrder2.confirmShipping();

        System.out.println(electronicsOrder1.getItemName() + " " + electronicsOrder1.getTotalPrice()  + "  Дата заказа " + electronicsOrder1.getDateCreated());
        System.out.println(electronicsOrder1.getDateConfirmed() + " Дата просмотра заказа ");
        System.out.println(electronicsOrder1.getDateShipped() + " Дата отправки ");

        System.out.println(electronicsOrder2.getItemName() + " " + electronicsOrder2.getTotalPrice() +  "  Дата заказа " + electronicsOrder2.getDateCreated());
        System.out.println(electronicsOrder2.getDateConfirmed() + " Дата просмотра заказа ");
        System.out.println(electronicsOrder2.getDateShipped() + " Дата отправки ");

        furnitureOrder1.calculatePrice();
        furnitureOrder1.validateOrder();
        furnitureOrder1.confirmShipping();

        furnitureOrder2.calculatePrice();
        furnitureOrder2.validateOrder();
        furnitureOrder2.confirmShipping();

        System.out.println(furnitureOrder1.getItemName() + " " + furnitureOrder1.getTotalPrice() +  "  Дата создания " + furnitureOrder1.getDateCreated());
        System.out.println(furnitureOrder1.getDateConfirmed() + " Дата просмотра заказа ");
        System.out.println(furnitureOrder1.getDateShipped() + " Дата отправки ");

        System.out.println(furnitureOrder2.getItemName() + " " + furnitureOrder2.getTotalPrice() + "  Дата создания " + furnitureOrder2.getDateCreated());
        System.out.println(furnitureOrder2.getDateConfirmed() + " Дата просмотра заказа ");
        System.out.println(furnitureOrder2.getDateShipped() + " Дата отправки ");




    }
}