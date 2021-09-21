package hackerRank;

class TimeConversionResult {
	/*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    
    String result="";
    String sFlag = s.substring(8, 10);
    int hour = Integer.parseInt(s.substring(0, 2));
    
    
	if(sFlag.equals("AM")) { // 12-> 0
		if(hour==12) {
			result="00";
		} else {
			result="0"+(String.valueOf(hour));
		}
		
	} else if(sFlag.equals("PM")) { // 12-> 12
		if(hour<12) {
			hour+=12;
		}
		result=(String.valueOf(hour));
		
	}
		result+=s.substring(2, 8);
    	return result;
    	
    	

    }
}

public class TimeConversion {

	public static void main(String[] args) {
		String s = "06:40:03AM";
		
		System.out.println(TimeConversionResult.timeConversion(s));
	}

}
