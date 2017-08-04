package lesson11.lesson11_hw1;

public interface API {
    Room[] findRooms(int price,int persons,String city,String hotel);
    Room[] getAll();


    static void findsRooms (BookingComAPI bookingComAPI) {
    }
}
