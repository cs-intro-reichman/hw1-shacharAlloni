// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1])/100; // How much percentage return does the money make per year
		int years = Integer.parseInt(args[2]);

		double interest = rate +1; // the interest per year

		double futureValue = currentValue*(Math.pow(interest,years));

		System.out.println("After " + years + " years, $" + currentValue + " saved at " + rate*100 + "% will yield $" +
							 (int) futureValue);


	}
}