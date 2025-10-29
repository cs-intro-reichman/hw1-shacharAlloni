// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int num = Integer.parseInt(args[0]);

		int hundreds = num/100;
		//System.out.println(hundreds); // Checking point.

		int tens = (num % 100)/10;
		//System.out.println(tens); // Checking point.

		int ones = num % 10;
		//System.out.println(ones); // Checking point.

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
