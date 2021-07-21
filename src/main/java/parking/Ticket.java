package parking;

import java.util.Date;
import java.util.List;

public class Ticket {
    private Vehicle vehicle;
    private List<Spot> spots;
    private Date startTime;

    public Ticket(Vehicle vehicle, List<Spot> spots) {
        this.vehicle = vehicle;
        this.spots = spots;
        this.startTime = new Date();
    }

    public List<Spot> getSpots() {
        return this.spots;
    }

    public Date getStartTime() {
        return this.startTime;
    }
}
