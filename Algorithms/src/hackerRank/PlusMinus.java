package hackerRank;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     * 양수/음수/제로
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	
    	double result1, result2, result3;
    	double cnt1=0;
    	double cnt2=0;
    	double arrSize = arr.size();
    	
    	for(int i=0; i<arrSize; i++) {
    		if(arr.get(i)>0) {
    			cnt1++;
    		} else if(arr.get(i)<0) {
    			cnt2++;
    		}
    	}
    	
    	
    	result1 = cnt1/arrSize;
    	result2 = cnt2/arrSize;
    	result3 = (arrSize-(cnt1+cnt2))/arrSize;
    	
    	System.out.format("%6f", result1);
    	System.out.println();
    	System.out.format("%6f", result2);
    	System.out.println();
    	System.out.format("%6f", result3);

    }

}

public class PlusMinus {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(-4);
		arr.add(3);
		arr.add(-9);
		arr.add(0);
		arr.add(4);
		arr.add(1);
		
	    PlusMinusResult.plusMinus(arr);
	}

}
