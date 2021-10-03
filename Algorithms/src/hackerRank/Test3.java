package hackerRank;

public class Test3 {

	/*
	 ����� ũ���� ������ ��ȣ�� 1���� ���۵Ǵ� 400 �������� å�� �ֿ����ϴ�. 
	å�� ���캸�� ���� �������� Ȧ��, ������ �������� ¦�� ��ȣ�̰� ��� ���������� ��ȣ�� �����־����ϴ�. å�� ������ �� ����� ũ���� ������ ��ȣ ������ ���� ���ӿ��� �̱� ����� å�� ����� �մϴ�. ������ ��ȣ ������ ��Ģ�� �Ʒ��� �����ϴ�.
	
	1. å�� ���Ƿ� ��Ĩ�ϴ�.
	2. ���� ������ ��ȣ�� �� �ڸ� ���ڸ� ��� ���ϰų�, ��� ���� ���� ū ���� ���մϴ�.
	3. ������ ������ ��ȣ�� �� �ڸ� ���ڸ� ��� ���ϰų�, ��� ���� ���� ū ���� ���մϴ�.
	4. 2~3 �������� ���� ū ���� ������ ������ �մϴ�.
	5. ������ ���� ���� ���� ����� ������ �����Դϴ�.
	6. ���� ���̳� ������ ���� �������� å�� ��ġ�� �ʽ��ϴ�.
	����� ũ���� ��ģ �������� ����ִ� �迭 pobi�� crong�� �־��� ��, ���� �̱�ٸ� 1, ũ���� �̱�ٸ� 2, ���ºδ� 0, ���ܻ����� -1�� return �ϵ��� solution �޼��带 �ϼ����ּ���.
	
	���ѻ���
	pobi�� crong�� ���̴� 2�Դϴ�.
	pobi�� crong���� [���� ������ ��ȣ, ������ ������ ��ȣ]�� ������� ����ֽ��ϴ�.
	����� ��
		pobi		crong	result
	[97, 98]	[197, 198]	 0
	[131, 132]	[211, 212]	 1
	[99, 102]	[211, 212]	 -1
	����� �� ����
	����� �� #1
	������ ������ 72��, ũ���� ������ 72���̹Ƿ� ���º��Դϴ�.
	�̸�	���� ������ �� �ڸ� ������ ��	���� �� �ڸ� ������ ��	������ ������ �� �ڸ� ������ ��	������ �� �ڸ� ������ ��
	����			16					63					17							72	
	ũ��			17					63					18							72
	����� �� #2
	������ ������ 6��, ũ���� ������ 5���̹Ƿ� ������ �¸��Դϴ�.
	
	�̸�	���� ������ �� �ڸ� ������ ��	���� �� �ڸ� ������ ��	������ ������ �� �ڸ� ������ ��	������ �� �ڸ� ������ ��
	����			5					3					6							6
	ũ��			4					2					5							4
	����� �� #3
	���� ��ģ �������� ���� ������ ��ȣ�� 99, ������ ������ ��ȣ�� 102�Դϴ�. �ùٸ� ������ ��ȣ�� �ƴϹǷ� ���ܻ��׿� �ش�˴ϴ�.
	 */
	public static void main(String[] args) {
		int[] pobi = {0, 0};
		int[] crong = {399, 400};
		
		System.out.println(solution(pobi, crong));
	}
	
	public static int solution(int[] pobi, int[] crong) {
		
		if(!pageEx(pobi, crong)) {
			return -1;
		}
		
		int pobiSum = sum(pobi);
		
		int pobiMul = mul(pobi);
	
		int pobiResult = maxNum(pobiSum, pobiMul);
	
		
		int crongSum = sum(crong);
		int crongMul = mul(crong);
		int crongResult = maxNum(crongSum, crongMul);
		
		
		if(pobiResult > crongResult) {
			return 1;
		} else if(pobiResult < crongResult) {
			return 2;
		} else if(pobiResult == crongResult) {
			return 0;
		} else {
			return -1;
		}
		
	}
	
	// ���ϱ�
	private static int sum(int[] num) {
		int val1=num[0];
		int val2=num[1];
		int sum=0;

		while(val1>0) {
			sum += val1%10;
			val1/=10;
		}
		
		val1 = sum;
		sum=0;
		while(val2>0) {
			sum += val2%10;
			val2/=10;
		}
		val2=sum;
		
		return maxNum(val1,val2);
	} 
	
	// ���ϱ�
	private static int mul(int[] num) {
		int val1 = num[0];
		int val2 = num[1];
		int mul=1;
		
		while(val1 > 0) {
			mul *= val1%10;
			val1/=10;

		}
		val1=mul;
		mul=1;
		
		while(val2>0) {
			mul *= val2%10;
			val2/=10;
		}
		val2=mul;
	
		
		return maxNum(val1, val2);
	}
	
	// �� �� �� �� ū ��
	private static int maxNum(int num1, int num2) {
		
		int result=0;
		if(num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
	}
	
	//����ó��
	private static boolean pageEx(int[] pobi, int[] crong) {
		
		
		if(pobi[1]-pobi[0] != 1 || crong[1]-crong[0] != 1) { // crong[0]-crong[1]= 1 �� ���� �ȵȴ�. 98 97�� ������ �� ���⿡!
			return false;
		} 
		if(pobi[0]%2 == 0 || crong[0]%2==0) {	// ���� �������� ¦���̰ų�
			return false;
		}
		if(pobi[1]%2==1 || crong[1]%2==1) {	// ������ �������� Ȧ���� ��
			return false;
		}
		
		if(pobi[0]<=0 || crong[0]<=0 || pobi[1]>400 || crong[1]>400) { // Ȥ�ó��ϰ�(1~400 �������� �ƴ� ���)
			return false;
		}
		
		return true;
	}
}
