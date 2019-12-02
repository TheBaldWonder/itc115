package Ticket;

public class StudentAdvanceTicket extends AdvanceTicket {
	
	public StudentAdvanceTicket(int number, int daysOut) {
		super(number, daysOut);
		getPrice(daysOut);
	}
	
	public double getPrice(int daysOut) {
		if (daysOut >= 10) {
			setPrice(super.getPrice(daysOut)/2);
		}
		else if (daysOut < 10) {
			setPrice(super.getPrice(daysOut)/2);
		}
		return getPrice();		
	}
	
	
	public String toString() {
		return super.toString() + " (ID Required)";
	}
}