package model.entities;

import model.exceptions.ReservationException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws ReservationException {
        if (checkIn.isAfter(checkOut)) {
            throw new ReservationException("Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int duration() {
        return (int) ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws ReservationException {
        if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
            throw new ReservationException("Reservation dates for update must be future dates");
        }
        if (checkIn.isAfter(checkOut)) {
            throw new ReservationException("Check-out date must be after check-in date");
        }
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + checkIn.format(fmt)
                + ", check-out: "
                + checkOut.format(fmt)
                + ", " + duration() + " nights";
    }
}
