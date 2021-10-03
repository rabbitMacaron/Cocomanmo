package hackerRank;

public class Test1 {
	/*
	  계좌에 들어있는 돈 일부를 은행에서 출금하고자 합니다.
	  돈 담을 지갑이 최대한 가볍도록 큰 금액의 화폐 위주로 받습니다.
	  돈의 액수 money가 매개변수로 주어질 때, 
	  지폐 : 오만원권/만원권/오천원권/천원권
	  동전 : 오백원/백원/오십원/십원/일원
	  각 몇 개로 변환되는지 금액이 큰 순서대로 배열에 담아 return하도록 solution 메서드를 완성하시오
	  
	  제한사항
	  money는 1이상 1,000,000 이하인 자연수
	  예시
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
