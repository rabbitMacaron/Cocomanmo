package hackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class Hash2 {
	
	/*
	 ��ȭ��ȣ ���
	���� ����
	��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
	��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
	
	������ : 119
	���ؿ� : 97 674 223
	������ : 11 9552 4421
	��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���� ����
	phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
	�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
	���� ��ȭ��ȣ�� �ߺ��ؼ� ������� �ʽ��ϴ�.
	����� ����
	phone_book	return
	["119", "97674223", "1195524421"]	false
	["123","456","789"]	true
	["12","123","1235","567","88"]	false
	����� �� ����
	����� �� #1
	�տ��� ������ ���� �����ϴ�.
	
	����� �� #2
	�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.
	
	����� �� #3
	ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.
	 */
	
	public static boolean solution(String[] phone_book) {
		
		boolean answer = true;
        Arrays.sort(phone_book);  //�����մϴ�.
        HashMap<String, String> checker = new HashMap<>();
        for(int j=0;j <phone_book.length  ;j++){
        	String arg = phone_book[j];
        	checker.put(arg, arg);  //����� �ֽ��ϴ�.
        	for(int i=0;i < arg.length();i++){ //������ Ű �� ������ �ٸ������� �ִ��� 
        		String mini = arg.substring(0,i);  //�ϳ��ϳ� �÷�����
        		if(checker.get(mini) != null){  //�����մϴ�.
        			answer = false;
        			break;
        		}
        	}            
        }
        return answer;
        
        
		/*boolean answer = true;
		
		Arrays.sort(phone_book);
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		
		for(int i=0; i< phone_book.length; i++) {
			for(int j=1; j<phone_book.length; j++) {
				if(map.containsKey(phone_book[i].substring(0,j))) {
					answer= false;
						
				}
			}
		}
		
		return answer;*/
    }
	
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}

}
