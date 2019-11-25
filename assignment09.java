//*******************************************************************
// Design and code a class for a generic product
		
		// 1. The product data should include a product code, description, 
		// price, and product count
		
		// 2. In addition to the getter and setter methods, the class should
		// implement toString and also a formatted output of the price (Hint: 
		// use the NumberFormat class. Here is the implementation of your 
		// formattedPrice method:
		
		// public String getPriceFormatted() {
		//	 String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		//   return formattedPrice; }
		
		// From the client app create instance of 2-3 different products and 
		// use the toString method to display their data
		
		// Optional: Keep track of the count of the products created and call
		// the getCount method to verify that it's correct (Where could you 
		// keep track of the count of products?).
//By: Jonathan Heilman	
//Date: 11/24/2019
//*******************************************************************

public class Assignment9 {

	public static void main(String[] args) {
		
		
		GenericProduct soda = new GenericProduct(1, "Grape Crush", 1.50, 5);
		GenericProduct book = new GenericProduct(2, "The DaVinci Code", 11.96, 1);
		GenericProduct dvd = new GenericProduct(3, "P90X", 10.00, 2);

		System.out.println(soda);
		System.out.println(book);
		System.out.println(dvd);
		
		}
	}
