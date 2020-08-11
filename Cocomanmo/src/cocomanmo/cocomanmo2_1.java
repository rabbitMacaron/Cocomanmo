package cocomanmo;

public class cocomanmo2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane", "Kim", "Lee"};
		solution(seoul);
		System.out.println(solution(seoul));
	}
	
	/*
	 *
	문제 : 서울에서 김서방 찾기
	-
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
	 * 
	 */
	public static String solution(String[] seoul) {
		String answer = "";
		int num=0;

		while(num<seoul.length) {
			if(seoul[num].equals("Kim")) {
				break;
			} else {
				num++;
			}
		}
		answer="김서방은 "+num+"에 있다";
		return answer;
	}
}

	/*
        String answer = "";
        int num=1001;
      	
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		num=i;
        		break;
        	}
        }
        answer = "김서방은 "+num+"에 있다";
        return answer;
    }*/


