/*
* Write a method called printPowersOfN that accepts a base and an exponent as arguments and  
* prints each power of the base from base (1) up to that maximum power, inclusive.
*/

public class Assignment3 {

	public static void main(String[] args) {

		printPowersOfN(2, 7);
		printPowersOfN(5, 3);

	}

	public static void printPowersOfN(int base, int exp) {
		int currentNum = 1;
		System.out.print(currentNum + " ");

		for (int i = 1; i <= exp; i++) {
			currentNum *= base;
			System.out.print(currentNum + " ");
		}

		System.out.println();
	}

}
