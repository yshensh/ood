package hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private Hotel hotel = null;
    private final Date startDate;
    private final Date endDate;
    private final List<Room> rooms;

    public Reservation(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        rooms = new ArrayList<>();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        String res = "Hotel is: " + hotel.getId() + ", start date is: " + startDate.toString() + ", End date is: " + endDate.toString()
                + ", rooms are: ";

        for (Room room : rooms) {
            res += room.getId() + "; ";
        }
        res += ". ";

        return res;
    }
}
