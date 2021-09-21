package hackerRank;


class StaircaseResult{
	/*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    	
    	String strSpace=" ";
    	String strShape="#";
    	
    	// .repeat -> 자바 11이상에서 사용 가능
//    	for(int i=1; i<=n; i++) { 
//    		String str="";
//    		str= strSpace.repeat(n-i);
//    		str += strShape.repeat(i);
//    		
//    		System.out.println(str);
//    	}
    	
    	for(int i=1; i<=n; i++) {  // 1
    		String str ="";
    		
    		for(int j=n; j>=1; j--) {	
    			if(j>i) {  // 6>1
    				str+=strSpace;
    			} else {
    				str+=strShape;
    			}
    		}
    		System.out.println(str);
    	}
    	
    }
}

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		StaircaseResult.staircase(n);
	}

}
