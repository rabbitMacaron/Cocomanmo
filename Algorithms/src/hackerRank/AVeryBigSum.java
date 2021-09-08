package hackerRank;

import java.util.ArrayList;
import java.util.List;

class AVeryBigSumResult {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    	long result=0;
    	
    	for(int i=0; i<ar.size(); i++) {
    		result+=ar.get(i);
    	}
    
    	return result;
    }

}


public class AVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int arCount = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Long::parseLong) .collect(toList());
		 * 
		 * long result = Result.aVeryBigSum(ar);
		 * 
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
		
		
		List<Long> ar = new ArrayList<Long>();
	
		ar.add(1000000001L);
		ar.add(1000000002L);
		ar.add(1000000003L);
		ar.add(1000000004L);
		ar.add(1000000005L);
		
	
		System.out.println(AVeryBigSumResult.aVeryBigSum(ar));
		
	}

}
