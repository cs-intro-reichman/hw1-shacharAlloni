// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill = Integer.parseInt(args[3]); // The bill of the restaurant define as integer due to the assingment request.

		double doubleBill = bill; // Referring to the bill as double.

		double divBill = doubleBill/3; // Divide the bill by 3 for each individual.

		divBill = Math.ceil(divBill); // Round up the individual bill.
		
		System.out.println("Dear " + name3 + ", " + name2 + ", " + name1 + ": pay " +
		divBill + " Shekels each.");
	


	}
}
