package hei.hotelbooking.model;

import java.time.LocalDate;

public class Booking {

    private String customerName;
    private String phone;
    private String email;
    private int roomNumber;
    private String roomDescription;
    private LocalDate bookingDate;

    public Booking() {}

    public Booking(String customerName, String phone, String email,
                   int roomNumber, String roomDescription, LocalDate bookingDate) {
        this.customerName = customerName;
        this.phone = phone;
        this.email = email;
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.bookingDate = bookingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }
}
