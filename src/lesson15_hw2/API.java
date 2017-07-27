package lesson15_hw2;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();


    static void findsRooms(BookingComAPI bookingComAPI) {
    }
}
