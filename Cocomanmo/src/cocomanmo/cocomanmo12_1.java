package cocomanmo;

import java.util.Arrays;
import java.util.Collections;

public class cocomanmo12_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String s = "Zbcdefg";
		//gfedcbZ
		//solution(s);
		System.out.println(solution(s));
	}
	
	
	/*
	 * 문자열 내림차순으로 배치하기
	 * 
	 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	   s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	   str은 길이 1 이상인 문자열입니다.
	 */
	public static String solution(String s) {
        String answer = "";
        
        Character [] chEqu = new Character [s.length()];
        
		for(int i=0; i<chEqu.length; i++) {
			chEqu[i] = s.charAt(i);
		}
		Arrays.sort(chEqu,Collections.reverseOrder());

		for(int i=0; i<chEqu.length; i++) {
			answer += chEqu[i];
		}
	
        return answer;
    }
}


