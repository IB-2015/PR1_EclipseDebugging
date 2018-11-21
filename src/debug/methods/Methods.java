package debug.methods;

import static pr.MakeItSimple.*;
import static debug.methods.Multiplier.*;

public class Methods {

	public static void main(String[] args) {
		
		// String concat
		String s1 = "Hello";
		String s2 = "World";
		String res;
		
		res = s1 + s2;
		s1 = "";
		
		println(res);
		
		
		// magic operator
		int result = magicOperator(3, 7 , 1);
		println(result);
	}

	private static int magicOperator(int i, int j, int k) {
		int sub = sub(i, j);
		int mult = mult(k, i);
		int add = add(sub, mult);
		return add;
	}

	private static int add(int i, int j) {
		return i + j;
	}

	private static int sub(int i, int j) {
		return i - j;
	}

}
