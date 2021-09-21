package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BirthdayCakeCandlesResult {
	
	/*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    	int max = Collections.max(candles);
    	int num=0;
    	for(int i=0; i<candles.size(); i++) {
    		if(max== candles.get(i)) {
    			num++;
    		}
    	}
    	return num;
    }
}

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		List<Integer> candles = new ArrayList<Integer>();
		
		candles.add(3);
		candles.add(2);
		candles.add(1);
		candles.add(3);
		
		System.out.println(BirthdayCakeCandlesResult.birthdayCakeCandles(candles));
	}
}
