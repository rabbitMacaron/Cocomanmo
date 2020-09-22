package cocomanmo;

public class cocomanmo10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		
		solution(num);
	}

	
	public static String solution(int num) {
        String answer = "";
        
        if(num%2==0) {
        	answer = "Even";
        } else {
        	answer = "Odd";
        }
        
        return answer;
    }
	
	
	
}
