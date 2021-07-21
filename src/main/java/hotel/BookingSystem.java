package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookingSystem {
    private final List<Hotel> hotels;

    public BookingSystem() {
        hotels = new ArrayList<>();
    }

    public List<Hotel> searchHotel(SearchHotelRequest request) {
        SearchRequest searchRequest = new SearchRequest(request.getStartDate(), request.getEndDate());

        int party = request.getGroupSize();

        List<Hotel> result = new ArrayList<>();
        for (Hotel hotel : hotels) {
            Map<RoomType, List<Room>> searchResult = hotel.handleSearchResult(searchRequest);
            int totalCapacity = 0;
            for (RoomType type : searchResult.keySet()) {
                List<Room> rooms = searchResult.get(type);
                for (Room room : rooms) {
                    if (room.isValidRequest(searchRequest)) {
                        totalCapacity += type.getCapacity();
                    }
                }
            }

            if (totalCapacity >= party) {
                result.add(hotel);
            }
        }
        return result;
    }

    public Reservation makeReservation(Hotel hotel, ReservationRequest request) {
        return hotel.makeReservation(request);
    }

    public void cancelReservation(Reservation reservation) {
        Hotel hotel = reservation.getHotel();
        hotel.cancelReservation(reservation);
    }

    public List<Hotel> getHotels() {
        return hotels;
    }
}
