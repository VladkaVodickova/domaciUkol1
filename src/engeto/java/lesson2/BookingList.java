package engeto.java.lesson2;

import java.math.BigDecimal;
import java.util.List;

public class BookingList {
    public static void main(String[] args) {
        Guests guestId1 = new Guests("Adéla","Malíková", "13.3.1993");
        Guests guestId2 = new Guests("Jana", "Dvořáčková", "5.5.1995");

        HotelRooms room1 = new HotelRooms(1,1,true, true, new BigDecimal("1000"));
        HotelRooms room2 = new HotelRooms(2, 1, true,true, new BigDecimal("1000"));
        HotelRooms room3 = new HotelRooms(3,3,false,true, new BigDecimal("2400"));

        BookingsOfRooms bookingId1 = new BookingsOfRooms(1,"19.7.2021", "26.7.2021", List.of(room1), List.of(guestId1));
        BookingsOfRooms bookingId2 = new BookingsOfRooms(2,"1.9.2021","14.9.2021", List.of(room3), List.of(guestId1,guestId2));

        System.out.println(bookingId1.getDescription()+bookingId2.getDescription());
    }
}
