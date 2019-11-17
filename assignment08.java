//*******************************************************************
//  Assignment 8: 
//
// Write a method called isSorted that accepts an array of real numbers
// as a parameter and returns true if the list is in sorted 
// (nondecreasing) order and false otherwise. 
		
// For example, if arrays named list1 and list2 store 
// [16.1, 12.3, 22.2, 14.4] and [1.5, 4.3, 7.0, 19.5, 25.1, 46.2]
// respectively, the calls isSorted(list1) and isSorted(list2) should
// return false and true respectively. Assume the array has at least 
// one element. A one element array is considered to be sorted.

//Write a method named isUnique that takes an array of integers as a parameter and that 
//returns a boolean value indicating whether or not the values in the array are unique (true 
//for yes, false for no). The values in the list are considered unique if there is no 
//pair of values that are equal. 

//By: Jonathan Heilman	
//Date: 11/15/2019
//*******************************************************************
public class Assignment8 {

	public static void main(String[] args) {
		
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double[] list3 = {1.5, 2.0, 3.5, 1.2, 9.6};
		
		int[] list4 = {1, 2, 2, 3, 7};
		int[] list5 = {1, 5, 2, 3, 7};
		int[] list6 = {2, 5, 2, 3, 1};

		
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
		System.out.println(isSorted(list3));
		System.out.println(isUnique(list4));
		System.out.println(isUnique(list5));
		System.out.println(isUnique(list6));
	}
	
	public static boolean isSorted(double[] list) {
		if (list.length > 1) { 
			for (int i = 0; i < list.length - 1; i++) {  
				if (list[i] > list[i + 1]) { // if current idx val greater than 
					return false;            // next idx val, return false
				}  
			}
		}
		return true; // Else, or if list len of one, return true
	}
	
	public static boolean isUnique(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        
	        for (int j = i + 1; j < array.length; j++) {
	            if (min > array[j]) {
	                array[i] = array[j];
	                array[j] = min;
	                min = array[i];
	            }
	        }
	        
	    }
	    
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] == array[i + 1]) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
