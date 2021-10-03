package hackerRank;

public class Test1 {
	/*
	  ���¿� ����ִ� �� �Ϻθ� ���࿡�� ����ϰ��� �մϴ�.
	  �� ���� ������ �ִ��� �������� ū �ݾ��� ȭ�� ���ַ� �޽��ϴ�.
	  ���� �׼� money�� �Ű������� �־��� ��, 
	  ���� : ��������/������/��õ����/õ����
	  ���� : �����/���/���ʿ�/�ʿ�/�Ͽ�
	  �� �� ���� ��ȯ�Ǵ��� �ݾ��� ū ������� �迭�� ��� return�ϵ��� solution �޼��带 �ϼ��Ͻÿ�
	  
	  ���ѻ���
	  money�� 1�̻� 1,000,000 ������ �ڿ���
	  ����
	  money		result
	  50237		[1, 0, 0, 0, 0, 2, 0, 3, 7]
	  15000		[0, 1, 1, 0, 0, 0, 0, 0, 0]
	 */

	public static void main(String[] args) {
		int money = 500000;
		int[] result = solution(money);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] solution(int money) {
		int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] answer = new int[coin.length];
		for(int i=0; i<coin.length; i++) {
			answer[i] = money/coin[i];
			money = money%coin[i];
			if(money==0) { break;}
		}
		return answer;
	}
}
