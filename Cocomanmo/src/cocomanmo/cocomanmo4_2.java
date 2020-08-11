package cocomanmo;

import java.util.ArrayList;

public class cocomanmo4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers= {1,3,2,4,2};
	//	int[] answers= {1,2,3,4,5};
		
		int[] z = solution(answers);
		for(int i=0; i< z.length; i++) {
			
			System.out.println(solution(answers)[i]);
		}
	}
	
	/*
	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... 
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

	제한 조건
	시험은 최대 10,000 문제로 구성되어있습니다.
	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	 */
	
	
	/*
	 문제 : 모의고사
	 -
	 채점 결과(6)
	 정확성: 100.0
	 합계: 100.0 / 100.0
	 */
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int size = answers.length;
        int[] math1 = new int[size];
        int[] math2 = new int[size];
        int[] math3 = new int[size];
        
        int[] repeat = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
    
        int cnt=1;
        int cnt2 = 1;
       
        for(int i=0; i<size; i++) {
	
        	//math1
        	math1[i]= cnt;
        
        	//math2
        	if(i%2==0) { 
        	math2[i]= 2;
        	} else {
        		math2[i]=cnt2;
        		cnt2++;
        		if(cnt2==2) {
        			cnt2++;
        		} else if(cnt2>5) {
        			cnt2=1;
        		}
        	}
        
        
        	//math3
        	if(i>9) {
        		math3[i] = repeat[i%10];
        	} else {
        		math3[i] = repeat[i];
        	}
        
        	
        	if(cnt>=5) {
        		cnt=1;
        	} else {
        		cnt++;        		
        	}
     
        
        }
        

        answer = new int[3];

    	for(int j=0; j<size; j++) {
    		if(math1[j] == answers[j]) {
    			answer[0]++;
    		}
    		
    		if(math2[j] == answers[j]) { 
    			answer[1]++;
    		}
    		
    		if(math3[j] == answers[j]) { 
    			answer[2]++;
    		}
    	}
    	
    	
    	ArrayList<Integer> result = new ArrayList<>();

    	int total =  Math.max(Math.max(answer[0], answer[1]), answer[2]);
    	



    	if(answer[0]==total) {
    		result.add(1);
    	}
    	
    	if(answer[1]==total) {
    		result.add(2);
    	}
    	if(answer[2]==total) {
    		result.add(3);
    	}
    	
    	
    	
    	int[] tt = new int[result.size()];
    
    	int temp = 0;
    	for(Integer num : result){
    		tt[temp++] = num;
 
        }
    	
    	 
        return tt;
    }
	
}
