package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CompareTheTripletsResult {

 

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here

    	List<Integer> result = new ArrayList<Integer>();
    	int sumA=0;
    	int sumB=0;
    	
    	for(int i=0; i<a.size(); i++) {
    		if(a.get(i)>b.get(i)) {
    			sumA++;
    		} else if(a.get(i)<b.get(i)) {
    			sumB++;
    		}
    		
    	}
    	
    	result.add(sumA);
    	result.add(sumB);
    	return result;
    }

}

public class CompareTheTriplets {

	public static void main(String[] args)  throws IOException {
		
		
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 * 
		 * List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 * 
		 * List<Integer> result = CompareTheTripletsResult.compareTriplets(a, b);
		 * 
		 * bufferedWriter.write( result.stream() .map(Object::toString)
		 * .collect(joining(" ")) + "\n" );
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
		 
		 
		List<Integer> a = new ArrayList<Integer>();
		
		List<Integer> b = new ArrayList<Integer>();
		
		a.add(17);
		a.add(28);
		a.add(30);
		
		b.add(99);
		b.add(16);
		b.add(8);
		
		
		System.out.println(CompareTheTripletsResult.compareTriplets(a, b));
		
	}

}
