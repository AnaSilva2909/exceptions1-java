import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scan.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(scan.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(scan.next());
            System.out.print("Check-out (dd/MM/yyyy): ");
            checkout = sdf.parse(scan.next());

            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);
        }

        catch (ParseException e) {
            System.out.println("Invalid date format");
        }

        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());

        }

        scan.close();

    }

}
