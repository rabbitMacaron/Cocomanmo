package hackerRank;

import java.awt.image.AbstractMultiResolutionImage;

public class Bee {
	// ���ع���) 2292��: ����
	/*
	���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
	���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	���� ���, 13������ 3��, 58������ 5���� ������.
	�Է�
	ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.
	
	���
	�Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.
	
	���� �Է� 1     ��
	13			> 3

	 */
	
	public static int solution(int num) {
		int result=1;
		//�߰� 1�� ������.
		// 6(n-1) .. 6�� ����!
		// 1�� : ~1
		// 2�� : 2~7 //~1+6 
		// 3�� : 8~19 // 1+18
		
		int val=1;
		
		while(true) {
			if(num>val) {
				result++;
				val+=6*(result-1);
			} else {
				break;
			}

		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int num=53;
		System.out.println(solution(num));
	}

}
