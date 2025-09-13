package application;

import model.entities.Reservation;
import model.exceptions.ReservationException;

import java.time.LocalDate;
import java.util.Scanner;

public class MainReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.nextLine(), Reservation.fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.nextLine(), Reservation.fmt);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.nextLine(), Reservation.fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.nextLine(), Reservation.fmt);

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ReservationException e) {
            // getMessage() obtém a string passada no lançamento da exceção durante
            // a validação feita no método chamado que lançou a exceção
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();

    }
}
