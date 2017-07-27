package lesson15_hw2;


public class TripAdvisorAPI implements API{
    Room[] rooms;


    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;

        for (Room room : rooms) {
            if (room!=null&&(room.getPersons() <= persons+ 1|| room.getPersons() >= persons - 1) && room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel) {
                index++;
            }
        }


        Room[] FinderRoom = new Room[index];
        int i = 0;
        for (Room room1 : rooms) {
            if (room1!=null&&(room1.getPersons() <= persons+ 1|| room1.getPersons() >= persons - 1) && room1.getPrice() == price && room1.getCityName() == city && room1.getHotelName() == hotel) {
                FinderRoom[i] = room1;
                i++;
            }
        }
        return FinderRoom;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}
