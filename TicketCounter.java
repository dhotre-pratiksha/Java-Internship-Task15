public class TicketCounter {

    private int availableTickets = 5;

    public synchronized void bookTicket(String userName) {

        if (availableTickets > 0) {
            System.out.println(userName + " is trying to book a ticket...");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets--;
            System.out.println(userName + " booked ticket successfully. Remaining tickets: " + availableTickets);
        }
        else {
            System.out.println(userName + " failed to book... No tickets available...!");
        }
    }
}

