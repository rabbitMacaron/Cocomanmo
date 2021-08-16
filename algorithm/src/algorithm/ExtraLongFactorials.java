package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


/*
 * 
 The factorial of the integer , written , is defined as:
 	n! = n*(n-1)*(n-2)*...*3*2*1
 Calculate and print the factorial of a given integer.
 For example, if n=30, we calculate 30*29*28*...*2*1 and get 265252859812191058636308480000000.
	
<Function Description>
	Complete the extraLongFactorials function in the editor below. It should print the result and return.
	extraLongFactorials has the following parameter(s):
		n: an integer	
<Note>
	: Factorials of n>20 can't be stored even in a 64-bit long long variable. Big integers must be used for such calculations. 
	Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.
	We recommend solving this challenge using BigIntegers.	
<Input Format>
	Input consists of a single integer n
<Constraints>
	1<=n<=100
<Output Format>
	Print the factorial of n.
 *
 */

class Result {

	public static void extraLongFactorials(int n) {
		// Write your code here
		BigInteger result = BigInteger.ONE;
		while (n != 1) {
			result = result.multiply(BigInteger.valueOf(n));
			n--;
		}
		System.out.println(result);
	}

}

public class ExtraLongFactorials {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		//int n= 30;
		Result.extraLongFactorials(n);

		bufferedReader.close();

	}

}
