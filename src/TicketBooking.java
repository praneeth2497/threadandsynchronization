
public class TicketBooking 

{
	int noOfTickets=10;
 synchronized public void bookTicket()
	{
	    noOfTickets--;
	    System.out.println(noOfTickets);
	}
	}

	class Customer extends Thread
	{
	    TicketBooking tb;
	    public Customer(TicketBooking tb)
	    {
	        this.tb=tb;
	    }
	    public void run()
	    {
	        tb.bookTicket();
	    }
	}
