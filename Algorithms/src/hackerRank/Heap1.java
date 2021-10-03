package hackerRank;

import java.util.PriorityQueue;

public class Heap1 {
	
	/*
	 ���� ����
	�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. 
	��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.
	
	���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
	Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
	Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� 
	���ϴ� ���ں� ���� K�� �־��� ��, 
	��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���� ����
	scoville�� ���̴� 2 �̻� 1,000,000 �����Դϴ�.
	K�� 0 �̻� 1,000,000,000 �����Դϴ�.
	scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.
	��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.
	
	����� ��
	scoville				K	return
	[1, 2, 3, 9, 10, 12]	7	2
	����� �� ����
	���ں� ������ 1�� ���İ� 2�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
	���ο� ������ ���ں� ���� = 1 + (2 * 2) = 5
	���� ������ ���ں� ���� = [5, 3, 9, 10, 12]
	
	���ں� ������ 3�� ���İ� 5�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
	���ο� ������ ���ں� ���� = 3 + (5 * 2) = 13
	���� ������ ���ں� ���� = [13, 9, 10, 12]
	
	��� ������ ���ں� ������ 7 �̻��� �Ǿ��� �̶� ���� Ƚ���� 2ȸ�Դϴ�.
	 */
	
	 public static int solution(int[] scoville, int K) {
	        int answer = 0;
	        
	        
	       PriorityQueue<Integer> heap = new PriorityQueue();
	       
	       for(int num : scoville) {
	    	   heap.offer(num);
	       }
	        
	       while(heap.peek() < K) {
	    	   if(heap.size() < 2) {
	    		   return -1;
	    	   }
	    	   
	    	   int f1 = heap.poll();
	    	   int f2 = heap.poll();
	    	   
	    	   int cal = f1 + f2*2;
	    	   heap.offer(cal);
	    	   answer++;
	       }
	        
	        
			/*  ��Ÿ�� ����  -> �޸𸮰� �� ū ��� ���� ����...../ȿ���� ����...
			ArrayList<Integer> arrScoville = new ArrayList<>();
			for(int num : scoville) {
				arrScoville.add(num);
			}
			
			
			while(arrScoville.get(0) < K) { 
			
				Collections.sort(arrScoville);
			
				int cal = arrScoville.get(0) + (arrScoville.get(1)*2);
				
					arrScoville.remove(1);
					arrScoville.remove(0);
					
					arrScoville.add(cal);
					answer++;
			
			}*/

	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k=7;
		
		
		System.out.println(solution(scoville, k));
	}
}
