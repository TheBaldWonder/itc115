package Ticket;

public abstract class Ticket {

	private int number;
	private double price;
	public static int count;

	public Ticket() {
		setTicketNum(0);
		count++;
	}

	public Ticket(int number) {
		setTicketNum(number);

	}

	public void setTicketNum(int number) {
		this.number = number;

	}

	public String toString() {
		return "Number: " + getNumber() + ", " + "Price: $" + getPrice();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;

	}
}
