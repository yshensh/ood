package hotel;

import java.util.Date;

public class SearchRequest {
    private final Date startDate;
    private final Date endDate;

    public SearchRequest(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        String res = "Start date is: " + startDate.toString() + ", End date is: " + endDate.toString();

        return res;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj == this) return true;
        if (!(obj instanceof SearchRequest)) return false;

        SearchRequest request = (SearchRequest) obj;

        return request.startDate.equals(this.startDate) && request.endDate.equals(this.endDate);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        int result = 17;
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        return result;
    }
}
