package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Booking;

public class BookingRepository {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}