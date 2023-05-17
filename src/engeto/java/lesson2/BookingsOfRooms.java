package engeto.java.lesson2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BookingsOfRooms {
    public enum TypeOfVacation {
        WORKING,
        RECREATIONAL
    }

    private int numberOfGuests;
    private LocalDate startOfBooking;
    private LocalDate endOfBooking;
    private TypeOfVacation typeOfVacationForGuest;
    private List<HotelRooms> hotelRoomsList;
    private List<Guests> guestsList;

    public BookingsOfRooms(int numberOfGuests, String startOfBookingStr, String endOfBookingStr, TypeOfVacation typeOfVacationForGuest, List<HotelRooms> hotelRoomsList, List<Guests> guestsList) {
        setNumberOfGuests(numberOfGuests);
        setStartOfBooking(startOfBookingStr);
        setEndOfBooking(endOfBookingStr);
        this.typeOfVacationForGuest = typeOfVacationForGuest;
        this.hotelRoomsList = hotelRoomsList;
        this.guestsList = guestsList;
    }

    public BookingsOfRooms(int numberOfGuests, String startOfBookingStr, String endOfBookingStr, List<HotelRooms> hotelRoomsList, List<Guests> guestsList) {
        setNumberOfGuests(numberOfGuests);
        setStartOfBooking(startOfBookingStr);
        setEndOfBooking(endOfBookingStr);
        this.hotelRoomsList = hotelRoomsList;
        this.guestsList = guestsList;
    }

    //getters
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public LocalDate getStartOfBooking() {
        return startOfBooking;
    }

    public LocalDate getEndOfBooking() {
        return endOfBooking;
    }

    public TypeOfVacation getTypeOfVacationForGuest() {
        return typeOfVacationForGuest;
    }

    public List<HotelRooms> getHotelRoomsList() {
        return hotelRoomsList;
    }

    public List<Guests> getGuestsList() {
        return guestsList;
    }

    //setters
    public void setNumberOfGuests(int numberOfGuests) {
        if(numberOfGuests > 0 && numberOfGuests <= 10){
            this.numberOfGuests = numberOfGuests;
        } else {
            throw new IllegalArgumentException("Enter valid number of quests which is from 1 to 10.");
        }
    }

    public void setStartOfBooking(String startOfBookingStr) {
        // pozn. pro kontrolujiciho - vlozila bych sem podminku, aby sli vytvorit pouze objednavky ode dneska dale do budoucnosti,
        // kdyby se vsak stalo, ze v hotelu nekdy spadne system, tak by neslo nikdy zpetne zapsat takovou objednavku,
        // proto to necham pouze takto
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate startOfBooking = LocalDate.parse(startOfBookingStr, formatter);
        this.startOfBooking = startOfBooking;
    }

    public void setEndOfBooking(String endOfBookingStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate endOfBooking = LocalDate.parse(endOfBookingStr, formatter);
        if (endOfBooking.isAfter(startOfBooking)){
            this.endOfBooking = endOfBooking;
        } else {
         throw new IllegalArgumentException("Enter valid end of booking period. This date needs to be after the start of the booking.");
        }
    }

    public void setTypeOfVacationForGuest(TypeOfVacation typeOfVacationForGuest) {
        this.typeOfVacationForGuest = typeOfVacationForGuest;
    }

    public void setHotelRoomsList(List<HotelRooms> hotelRoomsList) {
        this.hotelRoomsList = hotelRoomsList;
    }

    public void setGuestsList(List<Guests> guestsList) {
        this.guestsList = guestsList;
    }

    public String getDescription (){
        StringBuilder description = new StringBuilder();
        description.append("Number of Guests: ").append(this.numberOfGuests).append(" ");
        for (Guests guest : guestsList ){
            description.append(guest.getDescription()).append("\n");
        }
        for (HotelRooms room : hotelRoomsList){
            description.append(room.getDescription()).append("\n");
        }
        description.append("Start of the Booking: ").append(startOfBooking).append("\tEnd of the Booking: ").append(endOfBooking).append("\n-----------------------------------------------------------------------------------------------------------------------\n");
        return description.toString();
    }
}
