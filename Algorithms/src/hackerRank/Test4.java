package hackerRank;

public class Test4 {
	/*
	 ����̰� �����ϴ� 369����(����̴� �����Դϴ�.)�� �ϰ��� �մϴ�. 
	���̹��� 1���� ���ڸ� �ϳ��� ��鼭, 3, 6, 9�� ���� ���ڴ� ���ڸ� ���ϴ� ��� 3, 6, 9�� ������ŭ 
	�ջ��� �ľ� �մϴ�.
	
	���� number�� �Ű������� �־��� ��, 1���� number���� �ջ��� �� �� �ľ� �ϴ��� Ƚ���� return �ϵ��� 
	solution �޼��带 �ϼ����ּ���.
	
	���ѻ���
	number�� 1 �̻� 10,000 ������ �ڿ����Դϴ�.
	����� ��
	number	result
	13	4
	33	14
	����� �� ����
	����� �� #1
	1���� 13���� �� 4���� �ջ��� �ľ� �մϴ�.
	
	3	6	9	13
	¦	¦	¦	¦
	����� �� #2
	1���� 33���� �� 14���� �ջ��� �ľ� �մϴ�.
	
	3	6	9	13	16	19	23	26	29	30	31	32	33
	¦	¦	¦	¦	¦	¦	¦	¦	¦	¦	¦	¦	¦¦
	 */
	public static void main(String[] args) {
		int number=33;
		System.out.println(solution(number));
	}
	
	public static int solution(int number) {
		int sum=0;
		
		for(int i=1; i<=number; i++) {
			String str = String.valueOf(i);
			for (int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9') {
					System.out.println(str.charAt(j));
					sum++;
				}
			}
		}

		return sum;
	}

}
