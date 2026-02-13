public class TicketBookingApp {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        Thread user1 = new Thread(() -> counter.bookTicket("User-1"));
        Thread user2 = new Thread(() -> counter.bookTicket("User-2"));
        Thread user3 = new Thread(() -> counter.bookTicket("User-3"));
        Thread user4 = new Thread(() -> counter.bookTicket("User-4"));
        Thread user5 = new Thread(() -> counter.bookTicket("User-5"));
        Thread user6 = new Thread(() -> counter.bookTicket("User-6"));

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
    }
}
