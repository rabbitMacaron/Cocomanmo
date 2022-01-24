package programmers;

import java.util.HashMap;
import java.util.Map;

public class lotto {
	/*	�ζ� 6/45(���� '�ζ�'�� ǥ��)�� 1���� 45������ ���� �� 6���� �� ������ ��ǥ���� �����Դϴ�. �Ʒ��� �ζ��� ������ ���ϴ� ����Դϴ�. 
	
		����	��÷ ����
		1	6�� ��ȣ�� ��� ��ġ
		2	5�� ��ȣ�� ��ġ
		3	4�� ��ȣ�� ��ġ
		4	3�� ��ȣ�� ��ġ
		5	2�� ��ȣ�� ��ġ
		6(��÷)	�� ��
		�ζǸ� ������ �ο�� ��÷ ��ȣ ��ǥ���� �м�����ϰ� �־����ϴ�. ������, �ο��� ������ �ζǿ� ������ �Ͽ�, �Ϻ� ��ȣ�� �˾ƺ� �� ���� �Ǿ����ϴ�. ��÷ ��ȣ ��ǥ ��, �ο�� �ڽ��� �����ߴ� �ζǷ� ��÷�� �����ߴ� �ְ� ������ ���� ������ �˾ƺ��� �;� �����ϴ�.
		�˾ƺ� �� ���� ��ȣ�� 0���� ǥ���ϱ�� �ϰ�, �ο찡 ������ �ζ� ��ȣ 6���� 44, 1, 0, 0, 31 25��� �����غ��ڽ��ϴ�. ��÷ ��ȣ 6���� 31, 10, 45, 1, 6, 19���, ��÷ ������ �ְ� ������ ���� ������ �� ���� �Ʒ��� �����ϴ�.
	
		��÷ ��ȣ	31	10	45	1	6	19	���
		�ְ� ���� ��ȣ	31	0��10	44	1	0��6	25	4�� ��ȣ ��ġ, 3��
		���� ���� ��ȣ	31	0��11	44	1	0��7	25	2�� ��ȣ ��ġ, 5��
		������ �������, ������ �ζǿ� ��÷ ��ȣ�� ��ġ�ϴ� ��ȣ�� ������ ���� �ɷ� �����˴ϴ�.
		�˾ƺ� �� ���� �� ���� ��ȣ�� ���� 10, 6�̶�� �����ϸ� 3� ��÷�� �� �ֽ��ϴ�.
		3���� ����� �ٸ� ����鵵 �����մϴ�. ������, 2�� �̻����� ����� ���� �Ұ����մϴ�.
		�˾ƺ� �� ���� �� ���� ��ȣ�� ���� 11, 7�̶�� �����ϸ� 5� ��÷�� �� �ֽ��ϴ�.
		5���� ����� �ٸ� ����鵵 �����մϴ�. ������, 6��(��÷)���� ����� ���� �Ұ����մϴ�.
		�ο찡 ������ �ζ� ��ȣ�� ���� �迭 lottos, ��÷ ��ȣ�� ���� �迭 win_nums�� �Ű������� �־����ϴ�. �̶�, ��÷ ������ �ְ� ������ ���� ������ ���ʴ�� �迭�� ��Ƽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	
		���ѻ���
		lottos�� ���� 6�� ���� �迭�Դϴ�.
		lottos�� ��� ���Ҵ� 0 �̻� 45 ������ �����Դϴ�.
		0�� �˾ƺ� �� ���� ���ڸ� �ǹ��մϴ�.
		0�� ������ �ٸ� ���ڵ��� lottos�� 2�� �̻� ������� �ʽ��ϴ�.
		lottos�� ���ҵ��� ���ĵǾ� ���� ���� ���� �ֽ��ϴ�.
		win_nums�� ���� 6�� ���� �迭�Դϴ�.
		win_nums�� ��� ���Ҵ� 1 �̻� 45 ������ �����Դϴ�.
		win_nums���� ���� ���ڰ� 2�� �̻� ������� �ʽ��ϴ�.
		win_nums�� ���ҵ��� ���ĵǾ� ���� ���� ���� �ֽ��ϴ�.*/
	
	public static void main(String[] args) {

		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		int[]result = solution(lottos, win_nums);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

	
	public static int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }
}

/*	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int temp = 0;
		int zeroCnt = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				System.out.println(lottos[i]+"//"+i);
				zeroCnt++;
			} else {
				for (int j = 0; j < lottos.length; j++) {
					if (lottos[i] == win_nums[j]) {
						temp++;
						break;
					}

				}
			}
		}
		System.out.println(zeroCnt);
		System.out.println(temp);
		answer[0] = grade(temp+zeroCnt);
		answer[1] = grade(temp);

		
		return answer;
	}
	
	public static int grade(int num) {

		if(num==6) {
			return 1;
		} else if(num==5) {
			return 2;
		}else if(num==4) {
			return 3;
		}
		else if(num==3) {
			return 4;
		}
		else if(num==2) {
			return 5;
		} else {
			return 6;
		}
	}
}*/
/*   
	[44, 1, 0, 0, 31, 25]	      
	[0, 0, 0, 0, 0, 0]	  
	[45, 4, 35, 20, 3, 9]
	[31, 10, 45, 1, 6, 19]	     
	[38, 19, 20, 40, 15, 25]
	[20, 9, 3, 45, 4, 35]	
	[3, 5]    
	[1, 6]   
	[1, 1]    
*/