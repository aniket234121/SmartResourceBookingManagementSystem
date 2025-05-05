package service;

import java.util.List;

import entity.Booking;
import repository.BookingRepository;

public class BookingService {
    private BookingRepository bookingRepo = new BookingRepository();

    public void confirmBooking(Booking booking) {
        bookingRepo.addBooking(booking);
    }

    public List<Booking> listBookings() {
        return bookingRepo.getAllBookings();
    }
}
