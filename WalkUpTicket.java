package Ticket;

public class WalkUpTicket extends Ticket {
	
	public WalkUpTicket(int number) {
		setTicketNum(number);
	}
	
	public double getPrice() {
		return 50.00;
	}
	
	
}