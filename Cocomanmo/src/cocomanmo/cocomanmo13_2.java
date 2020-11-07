package cocomanmo;

public class cocomanmo13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,3,4};
		int[] arr= {5,5};
		System.out.println(solution(arr));
		//2.5
	}
	
	/* 평균 구하기
	 * 
	 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	 * 
	 * arr은 길이 1 이상, 100 이하인 배열입니다.
	 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
	 */
	
	public static double solution(int[] arr) {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++) {
        	answer += arr[i];
        	System.out.println(answer);
        }
        answer = answer/arr.length;
        return answer;
    }
}
