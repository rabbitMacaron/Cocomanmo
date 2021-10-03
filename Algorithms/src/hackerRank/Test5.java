package hackerRank;

import java.util.ArrayList;
import java.util.Stack;

public class Test5 {
	/*
	 ��ȣ���� �����ϴ� ��¥ ������ ������ �̹����� �ߺ� ���ڸ� �̿��� ���ο� ��ȣ�� ��������ϴ�. ���� ��� browoanoommnaon�̶�� ��ȣ���� ������ ���� ������ �ص��� �� �ֽ��ϴ�.

	1. "browoanoommnaon"
	2. "browoannaon"
	3. "browoaaon"
	4. "browoon"
	5. "brown"
	������ ���ڿ� cryptogram�� �Ű������� �־��� ��, �����ϴ� �ߺ� ���ڵ��� ������ ����� return �ϵ��� solution �޼��带 �ϼ����ּ���.
	
	���ѻ���
	cryptogram�� ���̰� 1 �̻� 1000 ������ ���ڿ��Դϴ�.
	cryptogram�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
	����� ��
	cryptogram	result
	browoanoommnaon	brown
	zyelleyz	""
	����� �� ����
	����� �� #1
	������ ���ÿ� �����ϴ�.
	
	����� �� #2
	������ ���� ������ �ص��� �� �ֽ��ϴ�.
	
	1. "zyelleyz"
	2. "zyeeyz"
	3. "zyyz"
	4. "zz"
	5. ""
	 */
	public static void main(String[] args) {
		String cryptogram = "browoanoommnaon";
		
		System.out.println(solution(cryptogram));
	}

	public static String solution(String cryptogram) {
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		
		
		for(int i=0; i<cryptogram.length(); i++) { 
			 char c = cryptogram.charAt(i);   	
			 
			 if(!stack.isEmpty() && stack.peek() == c) {
				 stack.pop();
			 } else {
			 stack.push(c);
			 }
		}
	
		 for (int i=0; i<stack.size(); i++) {
		        result+= (stack.get(i)).toString();
		    }
		 
		return result;
	}
}
