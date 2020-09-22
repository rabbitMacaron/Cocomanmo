package cocomanmo;

public class cocomanmo10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abcde";
		String s = "qwer";
		System.out.println(solution(s));
	}

	
	
	public static String solution(String s) {
        String answer = "";
        int n = s.length()/2;
        char scharAt = s.charAt(n);
        
        if(s.length()%2==0) {
        	answer = String.valueOf(s.charAt(n-1));
        } 
        answer += String.valueOf(scharAt);
        
        return answer;
    }
}
