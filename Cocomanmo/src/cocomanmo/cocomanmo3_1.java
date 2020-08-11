package cocomanmo;

public class cocomanmo3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		solution(n);
	}

	/*
	 *
	문제 : 수박수박수박수박수박수?
	-
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.00
	 * 
	 */
	public static String solution(int n) {
		String answer = "";

		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				answer+="수";
			} else {
				answer+="박";
			}
		}
		
		
		
		System.out.println(answer);
		return answer;
		/*
		String w = "수";
		String o = "박";
	
		if (n == 1) {
			answer=w;
		} else {
			int cnt = n / 2;
			for (int i = 0; i < cnt; i++) {
				answer += w + o;
			}
			if(n%2==1) {
				answer+=w;
			}

		}
		return answer; */
	}
}
