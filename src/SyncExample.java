public class SyncExample {

    public static void main(String[] args)
    {
     TicketBooking ticketBooking1=new TicketBooking();
    
    
     Customer customer1=new Customer(ticketBooking1);
     Customer customer2=new Customer(ticketBooking1);
     Customer customer3=new Customer(ticketBooking1);
    
     customer1.start();
     customer2.start();
     customer3.start();
    
    
        
        
    }

}