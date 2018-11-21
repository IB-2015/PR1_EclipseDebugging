package debug.arrays;

import static pr.MakeItSimple.*;

public class ArraySideEffect {

    public static void main(String[] args) {
    	int[] source = new int [5];
    	
    	// init array with 1, 2, 3, ...
    	for (int i = 0; i < source.length; i++)
    		source[i] = i;

    	int[] flatCopy = source;
    	
    	int[] deepCopy = new int[source.length];
    	for(int i = 0; i < source.length; i++)
    		deepCopy[i] = source[i];
    	
    	print("source:    ");
    	printArray(source);
    	print("copy:      ");
    	printArray(flatCopy);
    	print("deepCopy:  ");
    	printArray(deepCopy);
    	
    	source[3] = -1;
    	
    	println("After change");

    	print("source:    ");
    	printArray(source);
    	print("copy:      ");
    	printArray(flatCopy);
    	print("deepCopy:  ");
    	printArray(deepCopy);
    }

	private static void printArray(int[] source) {
		String output = "";
		String delimiter = ", ";
		for(int i = 0; i < source.length; i++)
			output += source[i] + delimiter;
		
		print(output.substring(0, output.length()- delimiter.length()));
		println();
	}

}
