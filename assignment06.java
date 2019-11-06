//*******************************************************************
//  Assignment 6: Write a method called boyGirl, using the boysgirls.txt file
//
// Description: Write a method called boyGirl that accepts a Scanner that is reading 
// its input from a file containing a series of names followed by 
// integer. The names alternate between boys' names and girls' names.
// Your method should compute the absolute difference between the sum of
// the boys' integers and the sum of the girls' integers. The input
// could end with either a boy or girl; you may not assume that it 
// contains an even number of names. For example, if the input file 
// contains the following text:
		
// Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stephanie 12 Ben 6
		
// Then the method should produce the following console output, since 
// the boys' sum is 27 and the girls' sum is 32:
		
// 4 boys, 3 girls
// Difference between boys' and girls' sums: 5

//By: Jonathan Heilman	
//Date: 11/05/2019
//*******************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		// 
		
		
		// Initializes Scanner with file object
		Scanner console = new Scanner(new File("boysgirls.txt"));
		boyGirl(console);
	    console.close();
	}
	
	public static void boyGirl(Scanner input) {
		int bSum = 0;   //   Initialize variables: 
		int bCount = 0; //     b/gCount holds the total number of b/g names
		int gSum = 0;   //     b/gSum holds sum of ints read from file
		int gCount = 0;
		int count = 0; 
		
		while (input.hasNext()) {
			@SuppressWarnings("unused")
			String name = input.next(); // Consumes str & int data from f obj
			int num = input.nextInt(); 
			count ++;
			if (count % 2 == 0) { // If loop count mod 2 equals 0:
				gSum += num;      //   The name and num are girls'
				gCount++;
			} else {              //   else, they're boys'
				bSum += num; 
				bCount++;
			}
		}
		int diff = Math.abs(gSum - bSum); // Gets absolute diff between b/gSums
		System.out.println(bCount + " boys, " + gCount + " girls. ");
		System.out.println("Difference between boys' and girls' sums: " + diff);
	}
}
