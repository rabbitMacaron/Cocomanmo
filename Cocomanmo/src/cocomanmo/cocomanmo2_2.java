package cocomanmo;

public class cocomanmo2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pPyYyoold";
		solution(s);
	}

	/*
	 *
	문제 : 문자열 내 p와 y의 개수
	-
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.00
	 * 
	 */
	static boolean solution(String s) {
        boolean answer = true;
        
        String[] us = s.toUpperCase().split("");
        int pCnt=0;
        int yCnt=0;
       
        for(int i=0; i<us.length; i++) {
        	if(us[i].equals("P")) {
        		pCnt++;
        	} else if(us[i].equals("Y")) {
        		yCnt++;
        	}
        }
        if(pCnt!=yCnt) {
        	answer = false;
        }
        return answer;
        
        
    /*
         다른 사람 답안
    array쓰지않고 문자를 한글자씩만 가져와서 비교
 	속도빠름... 좋은 방법 같다..    
         s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
      */
    }
}
