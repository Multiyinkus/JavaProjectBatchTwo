package doubts;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] ar1 = { 9, 5, 7, 2, 8, 4, 6 };// Array cannot print this instead you will get the memory location binary number
		
		System.out.println(Arrays.toString(ar1));// Therefore they need to be converted to string with Arrays.toString(varname)

		/*Integer[] ar1 = Arrays.stream(ar1).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.toString(ar1));

		Arrays.sort(ar1);    // to sort in arcending order

		System.out.println(Arrays.toString(ar1));

		Arrays.sort(ar1, Collections.reverseOrder());

		System.out.println(Arrays.toString(ar1));*/

	}
	//Day 41 video from batch one	

}
