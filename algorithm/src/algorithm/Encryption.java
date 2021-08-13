package algorithm;

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

/*
 *  Encryption [¾ÏÈ£È­]
 * 
 */

class EncryptionSolution {
	public static String encryption(String s) {
		    // Write your code here
		 String solResult=s.replace(" ", "");
		 int len = solResult.length();
		 int rows = (int)Math.sqrt(len);
		 int columns=(int) Math.ceil(Math.sqrt(len));
		 
		 
		 List<String> arrString = new ArrayList<String>();
		 
		 String result="";
		 
		 if(rows*columns < solResult.length()) {
			 rows++;
		 }
		 
		 // i * columns 0~7, 8~15, 14,
		 for(int i=0; i<rows; i++) {
			 if((i*columns)+columns>len) {
				 arrString.add(solResult.substring(i*columns));
			 } else {
				 arrString.add(solResult.substring(i*columns, (i*columns)+columns));
			 }
			 
		 }
		 
		 for(int i=0; i<columns; i++) {
			 for(int j=0; j<arrString.size(); j++) {
				 if(i<arrString.get(j).length()) {
					 result+=arrString.get(j).charAt(i);
				 }
			 }
			 result+=" ";
		 }
		 
		 
		 return result;
		    }
}

public class Encryption {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		  String s = "if man was meant to say on the ground god would have given us roots";
		  
		  String result = EncryptionSolution.encryption(s);
		 
		  System.out.println(result);
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String s = bufferedReader.readLine();
		 * 
		 * String result = EncryptionSolution.encryption(s);
		 * 
		 * bufferedWriter.write(result); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
	}
}
