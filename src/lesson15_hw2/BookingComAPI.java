package lesson15_hw2;

public class BookingComAPI implements API {
    Room[] rooms;


    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;

        for (Room room : rooms) {
            if (room!=null&&(room.getPrice() <= price + 100 || room.getPrice() >= price - 100) && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                index++;
            }
        }


            Room[] FinderRoom = new Room[index];
            int i = 0;
            for (Room room1 : rooms) {
                if (room1!=null&&(room1.getPrice() >= price - 100 || room1.getPrice() <= price + 100) && room1.getPersons() == persons && room1.getCityName() == city && room1.getHotelName() == hotel) {
                    FinderRoom[i] = room1;
                    i++;
                }
            }
            return FinderRoom;
        }



        @Override
        public Room[] getAll () {
            return rooms;
        }
    }