package hackerRank;

import java.util.Stack;

public class Greedy1 {
	/* 큰 수 만들기	
	  어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
	  예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.


	  문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요
	 */
	
	
	// 다른 사람 답안 중 추천수가 제일 많은 답! stack 활용
	public static String solution(String number, int k) {
		char[] result = new char[number.length() - k]; // 구해야하는 답(숫자)의 자리수
	    Stack<Character> stack = new Stack<>();	// stack 선언
	
	    for (int i=0; i<number.length(); i++) {	
	        char c = number.charAt(i);   // 1, 9, 2, 4
	        while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {	// stack이 비어있지않고 && 가장 최근에 push한 값(=top값)이 c보다 작고 && k--가 0보다 크면
	            stack.pop();								// pop
	        }
	        stack.push(c);									// push
	    }
	    for (int i=0; i<result.length; i++) {
	        result[i] = stack.get(i);
	    }
	    return new String(result);
	}
	
	/*
	// 통과
	public static String solution(String number, int k) {
		StringBuilder sb = new StringBuilder();
	    int index = 0;
	    int max = 0;
	    for(int i=0; i<number.length() - k; i++) {
	        max = 0;
	        for(int j = index; j<= k+i; j++) {
	            if(max < number.charAt(j)-'0') {
	                max = number.charAt(j)-'0';
	                index = j+1;
	            }
	        }
	        sb.append(max);
	    }
	    return sb.toString();
	} 
	
	
	
	// 한문제 시간초과 
	public static String solution(String number, int k) {
	    String answer = "";
	    String[] str = number.split("");
	    int strLen = str.length;
	    int cnt=0;
	    int max=0;
	
	    
		for(int i=0; i<strLen-k; i++) {
			max =0;
			for(int j=cnt; j<=k+i; j++) {
				if(max < Integer.parseInt(str[j])) {
					max = Integer.parseInt(str[j]);
					cnt = j+1;
				}
			}
			answer+=max;
		}
	    return answer;
	}
	*/
	
	public static void main(String[] args) {

		String number= "1924";
		int k = 2;
		System.out.println(solution(number, k));
		

		
	}

}
