package Ticket;

public class AdvanceTicket extends Ticket {
	
	private int daysOut;
	
	public AdvanceTicket(int number, int daysOut) {
		setTicketNum(number);
		getPrice(daysOut);
	}
	
	public double getPrice(int daysOut) {
		if (daysOut >= 10) {
			setPrice(30.00);
		}
		else if (daysOut < 10) {
			setPrice(40.00);
		}
		return getPrice();		
	}
		
}