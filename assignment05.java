//*******************************************************************
//  Assignment 5: Write a method called season, and a method called printGPA
//
// Description: printGPA: Accepts a Scanner for the console as a parameter and calculates a 
//student's grade point average. The user will type a line of input containing the student 
//name,then a number of scores followed by integers for each of those scores.
//
//season: This method will take to integer parameters representing a month and day and will return
//a string indicating the season for that month and day.
//By: Jonathan Heilman	
//Date: 10/22/2019
//*******************************************************************
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {

		// example entries:
		// Enter a student record: Jason 8 92 41 87 80 77
		// Jason's grade is 64.17

		// Enter a student record: Diana 24 92 85 61 77
		// Diana's grade is 67.80
		//Scanner console = new Scanner(System.in);
		//printGPA(console);}
	
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter the month number: ");
        int month = input.nextInt();
        System.out.print("Please enter the day number: ");
        int day   = input.nextInt();
        System.out.println(season(month,day));
        printGPA();
	}

	public static void printGPA() {
	    Scanner console = new Scanner(System.in);
	    System.out.print("Enter a student record: ");
	    String name = console.next();
	    int numScore = console.nextInt();
	    double sum = 0.0;
	    
	    for (int i = 0; i < numScore; i++) {
	        int score = console.nextInt();
	        sum += score;
	    }
	    
	    double average = sum / numScore;
	    System.out.println(name + "'s grade is " + average);
	}
	public static String season(int m, int d) {
	    if(m < 3 || (m == 3 && d <= 15) || (m == 12 && d >= 16)) {
	        return "Winter";
	    } else if((3 < m && m < 6) || (m == 3 && d >= 16) || (m == 6 && d <= 15)) {
	        return "Spring";
	    } else if((6 < m && m < 9) || (m == 6 && d >= 16) || (m == 9 && d <= 15)) {
	        return "Summer";
	    } else {
	        return "Fall";
	    }
	}
}
