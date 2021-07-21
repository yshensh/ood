package hotel;

import java.util.Date;
import java.util.Map;

public class ReservationRequest {
    private final Date startDate;
    private final Date endDate;
    private final Map<RoomType, Integer> roomsNeeded;

    public ReservationRequest(Date startDate, Date endDate, Map<RoomType, Integer> roomsNeeded) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomsNeeded = roomsNeeded;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Map<RoomType, Integer> getRoomsNeeded() {
        return roomsNeeded;
    }
}
