/*
 * Lab09a.java
 * 
 *   A program that asks the user for a list of numbers and stores them in an array. 
 *   Used to practice using arrays and breaking code up into methods, and as a first
 *   step to implementing Lab10b.java - selection sorting the final array.
 * 
 * @author Paul M Onderisin
 * @id Onderisin.1
 * 
 */
package osu.cse1223;
import java.util.Scanner;


public class Lab09b {

	public static void main(String[] args) {
		
		while(true)
		{
			Scanner in = new Scanner(System.in);
			
			int array_size = getNumDigits(in);
			
			if(array_size == 0)
			{
				break;
			}
			
			int[] int_array = new int[array_size];
			
			getDigits(int_array, in);
			
			System.out.println("\nArray before sorting:: ");
			displayDigits(int_array);
			
			selectionSort(int_array);
		}
		
		System.out.print("No digits to store? Goodbye!");
		
	}
	
	// Given a Scanner as input, prompts the user for the number of digits they will be 
	// entering into an array.  If the number given by the user is less than 0, display
	// an error message and ask for a number that is 0 or greater.  When a valid number is
	// received, return it to the calling program.
	private static int getNumDigits(Scanner inScanner) {
		
		while(true)
		{
			System.out.print("Please enter the number of digits to be stored: ");
			int size  = inScanner.nextInt();
			
			if(size >= 0)
			{
				return size;
			}
			else
			{
				System.out.println("ERROR!  You must enter a non-negative number of digits!");
				System.out.println("");
			}
			
			
		}
		
	}

	// Given an array and a Scanner as input, prompt the user to input integers to fill the
	// array.  The procedure should display a prompt for the user to enter an integer, and
	// should loop until the entire array is filled with integer.
	private static void getDigits(int[] digits, Scanner inScanner) {

		for(int i = 0; i < digits.length; i++)
		{
			System.out.print("Enter integer " + i + ": ");
			digits[i] = inScanner.nextInt();
			inScanner.nextLine();
		}
	}
	
	// Given an array as input, displays the total number of digits contained in the array
	// and displays the contents of the array in order, starting at index 0 and ending
	// with the final index of the array.
	private static void displayDigits(int[] digits) {
		
		System.out.println("Number of digits in array: " + digits.length);
		System.out.print("Digits in array: ");
		
		for(int i = 0; i < digits.length; i++)
		{
			System.out.print(digits[i] + " ");
		}
		
		System.out.println("\n");
		
	}

	// FOR LAB10B
	// Given an array of integers as input, sorts the array using the Selection Sort algorithm
	// provided in the Closed Lab 10 write-up.
	private static void selectionSort(int[] digits) {
		
		// 3 2 1
		
		System.out.println("Array after sorting: ");
		int run = 0;
		while(run < digits.length)
		{
			for(int i = 1; i < digits.length; i++)
			{
				
				if(digits[i] < digits[i-1])
				{
					int temp = digits[i-1];
					digits[i-1] = digits[i];
					digits[i] = temp;
					
				}
			}
			
			run++;
		}
		
		displayDigits(digits);
		

	}
	
}
