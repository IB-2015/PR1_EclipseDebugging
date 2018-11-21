package debug.methods;

public class Multiplier {

	public static int mult(int i, int j) {
		int product = 0;
		
		// assume i always positive
		while(i > 0) {
			product += j;
			i--;
		}
		
		return product;
	}

}
