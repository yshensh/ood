package hotel;

import java.util.Date;

public class SearchHotelRequest {
    private final Date startDate;
    private final Date endDate;
    private final int groupSize;

    public SearchHotelRequest(Date startDate, Date endDate, int groupSize) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.groupSize = groupSize;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getGroupSize() {
        return groupSize;
    }
}
