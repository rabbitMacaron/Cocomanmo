package cocomanmo;

import java.util.ArrayList;
import java.util.Collections;

public class cocomanmo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 5, 7 };
		int divisor = 4;

		solution(arr, divisor);

	}
	
	/*
	 *
	문제 : 나누어 떨어지는 숫자 배열
	-
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
	 * 
	 */

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		ArrayList<Integer> sol = new ArrayList<>();

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % divisor == 0) {
				sol.add(arr[i]);
				cnt++;
			}
		}
		
		if (cnt == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			Collections.sort(sol);
			answer = new int[sol.size()];
			for (int i = 0; i < sol.size(); i++) {
				answer[i] = sol.get(i);
			}
		}
		return answer;

/*
	 int[] answer = {};
 
        answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        Arrays.sort(answer);
 
        if (answer.length == 0) {
            answer = new int[]{-1};
        }


		return answer; 
*/
	}

}
