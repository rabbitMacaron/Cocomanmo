package cocomanmo;

public class cocomanmo5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 987654321;  //45
		System.out.println(solution(n));
		
	}
	/*
	문제 : 자릿수 더하기
	 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

	제한사항
	N의 범위 : 100,000,000 이하의 자연수 
	 */
	
	/*
	 -
	 채점 결과(2)
	 정확성: 100.0
	 합계: 100.0 / 100.0
	 */
	public static int solution(int n) {
		int answer = 0;
		String lenStr = Integer.toString(n);
		int len = lenStr.length();
		
		for(int i=len-1; i>=0; i--) {
			int cnt=1;
			cnt = (int) Math.pow(10, i);	
			answer += (int)(n/cnt);		
			n= n-((int)(n/cnt)*cnt);
			
			
		}
		return answer;

	}
	// 1의 자리부터 계산하고 싶었는데 방법이 떠오르지않아서 제일 큰 자리부터 계산했음. 
	// 그 때문에 string으로 변환해서 자리수를 받는 과정도 거침 ㅜㅜ
	// %도 해봤는데 몫을 쓸 생각만하고 나머지를 활용할 생각을 못했다.
	// 너무 아쉽다. ....
	
	
	/*
	 int answer = 0;
        while(n!=0){
            answer+=n%10;
            n=n/10;
        }
        return answer;
      */


}
