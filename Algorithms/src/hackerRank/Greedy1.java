package hackerRank;

import java.util.Stack;

public class Greedy1 {
	/* ū �� �����	
	  � ���ڿ��� k���� ���� �������� �� ���� �� �ִ� ���� ū ���ڸ� ���Ϸ� �մϴ�.
	  ���� ���, ���� 1924���� �� �� ���� �����ϸ� [19, 12, 14, 92, 94, 24] �� ���� �� �ֽ��ϴ�. �� �� ���� ū ���ڴ� 94 �Դϴ�.


	  ���ڿ� �������� ���� number�� ������ ���� ���� k�� solution �Լ��� �Ű������� �־����ϴ�. number���� k ���� ���� �������� �� ���� �� �ִ� �� �� ���� ū ���ڸ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ��ϼ���
	 */
	
	
	// �ٸ� ��� ��� �� ��õ���� ���� ���� ��! stack Ȱ��
	public static String solution(String number, int k) {
		char[] result = new char[number.length() - k]; // ���ؾ��ϴ� ��(����)�� �ڸ���
	    Stack<Character> stack = new Stack<>();	// stack ����
	
	    for (int i=0; i<number.length(); i++) {	
	        char c = number.charAt(i);   // 1, 9, 2, 4
	        while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {	// stack�� ��������ʰ� && ���� �ֱٿ� push�� ��(=top��)�� c���� �۰� && k--�� 0���� ũ��
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
	// ���
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
	
	
	
	// �ѹ��� �ð��ʰ� 
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
