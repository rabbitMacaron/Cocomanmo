package cocomanmo;

import java.util.ArrayList;
import java.util.Collections;

public class cocomanmo6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12; //28
		System.out.println(solution(n));
		

	}
	/*
	 * 문제 : 약수의 합 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	 * 
	 * 제한 사항 n은 0 이상 3000이하인 정수입니다.
	 */

	/*
	 채점결과(3) :
	 정확성: 100.0
	 합계: 100.0 / 100.0
	 */

	public static int solution(int n) {
		
		int answer = 0;
		int num = (int) (n/2)+1;
	
		for (int i = 1; i <= num; i++) {
			
			if (n % i == 0) {
				if(i<(n/i)) {
					answer += (i+ n/i);
				} else if((n/i)==i) {
					answer += i;
				}
			}
		}

		return answer; 
		
		// 다른사람풀이
		//절반만 돌리면 되는 건 알았는데 n을 더할 생각을 못했다
		//다음부턴 좀 더 넓게 생각해야지
		 
		/*
		 int answer = 0;
         for(int i = 1; i <= n/2; i++){
        	 if(n%i == 0)  {
        		 answer += i;
        	 }
         }
     return answer+n; */
	}
}
