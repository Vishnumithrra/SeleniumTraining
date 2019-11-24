package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int n=0, fn=1, sn;
		// Iterate from 1 to the range
		for (int i = 2; i < 8; i++) {
			
		sn= n+fn;
		System.out.println("the first numer" +sn);	// Print first number 
			
		// add first and second number
			
	n=fn;	// Assign second nuumber to the first number
			
		 fn=sn;	// Assign sum to the second number
			
	
		}
	}

}
