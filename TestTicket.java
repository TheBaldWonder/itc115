package Ticket;

public class TestTicket {
	
	public static void main(String[] args) {		
		
		int count = Ticket.count;
		
		
		
		Ticket t1 = new WalkUpTicket(5);
		System.out.println("Walkup Ticket:");
		System.out.println(t1);
		// WalkUp tickets are $50
		
		Ticket t2 = new AdvanceTicket(3,12);  
		System.out.println("Advance Ticket:");
		System.out.println(t2);
		//Advance tickets are $30 if purchased more than 10 days in advance, or $40 if less than 10 days.
		
		Ticket t3 = new StudentAdvanceTicket(7,15);
		System.out.println("Student Advance Ticket:");
		System.out.println(t3);
		//Student advance tickets are half price or regular advance tickets, and require ID
		
		Ticket t4 = new StudentAdvanceTicket(10,2);
		System.out.println("Student Advance Ticket:");
		System.out.println(t4);
		
		count = Ticket.count;
		System.out.printf("We have sold %d tickets.", count);
		

		
	}
	
	public static void sp() {
		System.out.println();
	}

}