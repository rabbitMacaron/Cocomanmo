package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MiniMaxSumResult {
	/*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	Collections.sort(arr);
    
    	long maxNum = 0;
    	long minNum=0;
    	
    	for(int i=0; i<arr.size()-1; i++) {
    		maxNum += arr.get(i+1);
    		minNum += arr.get(i);
    	}
    	
    	System.out.println(minNum+" "+maxNum);
    	
    }
}

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(140638725);
		arr.add(436257910);
		arr.add(953274816);
		arr.add(734065819);
		arr.add(362748590);

		MiniMaxSumResult.miniMaxSum(arr);
	}

}
