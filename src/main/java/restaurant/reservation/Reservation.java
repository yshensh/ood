package restaurant.reservation;

import java.util.Date;

public class Reservation {
    private final Table table;
    private final Date date;

    public Reservation(Table table, Date date) {
        this.table = table;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Table getTable() {
        return table;
    }
}
