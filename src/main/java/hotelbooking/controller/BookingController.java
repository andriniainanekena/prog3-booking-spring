package hei.hotelbooking.controller;

import hei.hotelbooking.model.Booking;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private List<Booking> bookings = new ArrayList<>();


    @GetMapping
    public List<Booking> getBookings() {
        return bookings;
    }


    @PostMapping
    public List<Booking> createBooking(@RequestBody Booking booking) {

        if (booking.getRoomNumber() < 1 || booking.getRoomNumber() > 9) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Room numbers must be between 1 and 9"
            );
        }

        for (Booking b : bookings) {
            if (b.getRoomNumber() == booking.getRoomNumber() &&
                b.getBookingDate().equals(booking.getBookingDate())) {

                throw new ResponseStatusException(
                        HttpStatus.CONFLICT,
                        "Room already booked for this date"
                );
            }
        }

        bookings.add(booking);

        return bookings;
    }
}
