package debug.recursion;

import static pr.MakeItSimple.*;

/*
 * adjusted code from: https://introcs.cs.princeton.edu/java/23recursion/Factorial.java.html
 */

/******************************************************************************
 *  Compilation:  javac Factorial.java
 *  Execution:    java Factorial n
 *
 *  Reads an integer command-line argument n, and prints n! = 1 * 2 * ... * n
 *  to standard output.
 *
 *  % java Factorial 0
 *  1
 *
 *  % java Factorial 1
 *  1
 *
 *  % java Factorial 5
 *  120
 *
 *  % java Factorial 12
 *  479001600
 *
 *  % java Factorial 20
 *  2432902008176640000
 *
 *  % java Factorial -10
 *  java.lang.RuntimeException: Underflow error in factorial
 *
 *  % java Factorial 21
 *  java.lang.RuntimeException: Overflow error in factorial
 *
 *
 *  Remarks
 *  -------
 *   - Would overflow a long if n > 20
 *   - Need to use extended precision arithmetic to handle bigger factorials
 *
 ******************************************************************************/

public class Factorial {

    // return n!
    // precondition: n >= 0 and n <= 20
    public static long factorial(long n) {
    	pr.MakeItSimple.println("Compute factorial of: " + n);
        if (n < 0) {
        	return -1;
        } else if (n > 20) {
        	return -1;
        } else if (n == 0) {
        	return 1;
        } else {
        	long factorial = n * factorial(n-1);
        	println("Factorial of: " + factorial);
        	return factorial;
        }
    }

    public static void main(String[] args) {
    	int n = 7;
        println(factorial(n));
    }

}
