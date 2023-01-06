import java.util.Scanner;

public class Main {
    static int upper = 21;
    static int middle = 21;
    static int lower = 21;
    static int rac = 18;
    static int waiting_list = 10;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME TO RAILWAY TICKET RESERVATION");
        boolean run = true;
        while (run) {
            System.out.println("1)Book Tickets" +
                    "\n2)Cancel Tickets" +
                    "\n3)Available Tickets" +
                    "\n4)Booked Tickets" +
                    "\n5)Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Booking.ticket_booking();
                    break;
                case 2:
                    Booking.ticket_cancelling();
                    break;
                case 3:
                    Booking.available_tickets();
                    break;
                case 4:
                    Booking.booked_tickets();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
    }
}