package cocomanmo;

import java.util.ArrayList;

public class cocomanmo10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		// solution(n);
		System.out.println(solution(n));
	}

	/*
	 * 문제 설명 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
	 * 
	 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
	 * 
	 * 제한 조건 n은 2이상 1000000이하의 자연수입니다.
	 */


	public static int solution(int n) {
		//통과한 코드
		
		// 소수를 배열로 넣는 게 아니라, 주어진 수를 배열에 넣어보기로 함
        int answer = 0;
        int[] result = new int[n+1];
        
        for(int i=2; i<=n; i++) {
        	result[i]=i;
        }
        
        // 소수로 나누는 방법이랑 비슷한데, 배수를 지우는 법이 시간이 빠를 거 같아서 해봄
        for(int i=2; i<=n; i++) {
        	for(int j=2*i; j<=n; j+=i) {
        		result[j]=0;
        	}
        }
        
        for(int i=0; i<=n; i++) {
        	if(result[i]!=0) {
        		answer++;
        	}
        }
        
        
        //정확성은 만점인데, 효율성 통과못함
        /*
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int j=2; j<=n; j++) { 	
    	boolean trFl=true;
        	int cnt = result.size();
        	
        	//소수로 나눠지면 그 수는 소수가 아님
        	for(int i=0; i<cnt; i++) {
        		if(j% (result.get(i).intValue())==0) {
        			trFl = false;
        			break;
        		} 
        	}
        	if(trFl) {
        		result.add(j);
        		answer++;
        	}
        }
        */
        
        return answer;
    }
}
