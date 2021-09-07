package hackerRank;

import java.util.Scanner;

public class SolveMeFirst {
	
	
	static int solveMeFirst(int a, int b) {
		// Write your code here
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}

}
