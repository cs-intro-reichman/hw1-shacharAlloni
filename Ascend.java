// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int limit = Integer.parseInt(args[0]);

		int a = (int) (Math.random()*limit);
		int b = (int) (Math.random()*limit);
		int c = (int) (Math.random()*limit);

		System.out.println(a + " " + b + " " + c);

		// Finding absolute min
		int min = Math.min(Math.min(a,b),c);

		// Finding absolute max
		int max = Math.max(Math.max(a,b),c);

		// Finding mid
		int min1 = Math.min(a, b);
		int min2 = Math.min(b, c);
		int min3 = Math.min(a, c);

		int mid = Math.max(Math.max(min1, min2),min3);

		System.out.println(min + " " + mid + " " + max);
	}
}
