//*******************************************************************
//  Assignment 4: Repetition of Strings
//
// Description: Accepts a String and a number of repetitions as parameters 
// and returns the String concatenated that many times.
//By: Jonathan Heilman	
//Date: 10/14/2019
//*******************************************************************

public class Assignment4 {

	public static void main(String[] args) {
		
				System.out.println(repl("hello", 0));
				System.out.println(repl("hello", 3));
				System.out.println(repl("hola", 4));
				System.out.println(repl("bonjour", 5));
				System.out.println(repl("konnichiwa", 6));
			}
			
			public static String repl(String str, int reps) {
				String output = "";
				if (reps > 0) { // If reps 1 or more, return str concatenated reps times
					output = str;
					for (int i=1; i < reps; i++) {
						output += str;
					} 
				}
				return output;	// If reps less than 1, Return empty string
			}
		}	
