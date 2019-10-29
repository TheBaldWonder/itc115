//*******************************************************************
//  Midterm: Write a piece of code that reads shorthand text description
//  of a playing card and prints the long hand equivalent.
//
//
//  By: Jonathan Heilman	
//  Date: 10/28/2019
//*******************************************************************
import java.util.*;

public class Midterm {

	public static void main(String[] args) {

		// Scanner for user card input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a card: ");
		String card = input.nextLine();
		input.close();

		// Convert user input to Upper case
		card = card.toUpperCase();

		// Rank of card
		if (card.indexOf("A") == 0) {
			System.out.print("Ace of");
		} else if (card.indexOf("2") == 0) {
			System.out.print("Two of");
		} else if (card.indexOf("3") == 0) {
			System.out.print("Three of");
		} else if (card.indexOf("4") == 0) {
			System.out.print("Four of");
		} else if (card.indexOf("5") == 0) {
			System.out.print("Five of");
		} else if (card.indexOf("6") == 0) {
			System.out.print("Six of");
		} else if (card.indexOf("7") == 0) {
			System.out.print("Seven of");
		} else if (card.indexOf("8") == 0) {
			System.out.print("Eight of");
		} else if (card.indexOf("9") == 0) {
			System.out.print("Nine of");
		} else if (card.indexOf("10") == 0) {
			System.out.print("Ten of");
		} else if (card.indexOf("J") == 0) {
			System.out.print("Jack of");
		} else if (card.indexOf("Q") == 0) {
			System.out.print("Queen of");
		} else if (card.indexOf("K") == 0) {
			System.out.print("King of");
		}

		// Suit of card
		if (card.indexOf("C") == 2 || card.indexOf("C") == 3) {
			System.out.print(" Clubs");
		} else if (card.indexOf("D") == 2 || card.indexOf("D") == 3) {
			System.out.print(" Diamonds");
		} else if (card.indexOf("H") == 2 || card.indexOf("H") == 3) {
			System.out.print(" Hearts");
		} else if (card.indexOf("S") == 2 || card.indexOf("S") == 3) {
			System.out.print(" Spades");
		}

	}

}
